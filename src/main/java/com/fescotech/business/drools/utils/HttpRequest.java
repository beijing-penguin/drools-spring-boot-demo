package com.fescotech.business.drools.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.lang.reflect.Field;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * http协议请求通用工具
 * @author DC工作室
 * @time 2015-05-05 17:43
 * @version 1.0
 */
public class HttpRequest {
	private static Log LOG = LogFactory.getLog(HttpRequest.class);
	private static String CHARSET = "UTF-8";
	public class HttpParam{
		private String url;
		private String param;
		private Map<String,Object> paramMap;
		private String cookie;
		private String charset = CHARSET;
		
		public String getUrl() {
			return url;
		}
		public void setUrl(String url) {
			this.url = url;
		}
		public String getParam() {
			return param;
		}
		public void setParam(String param) {
			this.param = param;
		}
		public Map<String, Object> getParamMap() {
			return paramMap;
		}
		public void setParamMap(Map<String, Object> paramMap) {
			this.paramMap = paramMap;
		}
		public String getCookie() {
			return cookie;
		}
		public void setCookie(String cookie) {
			this.cookie = cookie;
		}
		public String getCharset() {
			return charset;
		}
		public void setCharset(String charset) {
			this.charset = charset;
		}
	}
	/**
	 * 发送get请求
	 * @param urlName 请求地址
	 * @param param	请求参数，请求参数应该是 name1=value1&name2=value2 的形式。
	 * @param charset 对响应回来的数据进行解码，默认编码utf-8
	 * @return 返回换行的的结果
	 * @throws IOException 
	 * @throws InterruptedException 线程被中断时
	 */
	public static String sendGet(String urlName, String param,String cookie ,String charset) {
		if(charset==null){
			charset = "UTF-8";
		}
		StringBuffer sb = new StringBuffer();
		HttpURLConnection connection = null;
		InputStream  in = null;
		InputStreamReader ir = null;
		BufferedReader br = null;
		try {
			if(param!=null&&!"".equals(param.trim())){
				urlName = urlName+"?"+param;
			}
			URL url = new URL(urlName);
			// 打开和URL之间的连接
			connection = (HttpURLConnection) url.openConnection();
			connection.setConnectTimeout(60000);//60秒
			connection.setReadTimeout(60000);
			connection.setRequestMethod("GET");
			// 设置通用的请求属性
			connection.setRequestProperty("accept", "*/*");
			connection.setRequestProperty("connection", "Keep-Alive");
			//规定窗体数据被编码为名称/值对，，，如果是multipart/form-data： 窗体数据被编码为一条消息
			connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
			//设置cookie
			if(cookie!=null){
				connection.setRequestProperty("Cookie",cookie);
			}
			// 获取所有响应头字段
			//Map<String, List<String>> map = connection.getHeaderFields();
			// 遍历所有的响应头字段
			/*for (String key : map.keySet()) {
				System.out.println(key + ":" + map.get(key));
			}*/
			in = connection.getInputStream();
			ir = new InputStreamReader(in,charset);
			// 获取输入流
			br = new BufferedReader(ir);
			String line = null;
			/*while(!br.ready()){//数据量大时，等待数据传输完毕
				Thread.sleep(500);
			}*/
			while ((line = br.readLine()) != null) {// 循环读取流
				if(sb.length()>0){
					sb.append("\r\n");
				}
				sb.append(line);
				
			}
			return sb.toString();
		}catch (Exception e) {
			e.printStackTrace();
			LOG.error("",e);
		}finally{
			// 释放资源
			if(br!=null){
				try {
					br.close();
					br = null;
				} catch (IOException e) {
					LOG.error("",e);
				}
			}
			if(ir!=null){
				try {
					ir.close();
					ir = null;
				} catch (IOException e) {
					LOG.error("",e);
				}
			}
			if(in!=null){
				try {
					in.close();
					in = null;
				} catch (IOException e) {
					LOG.error("",e);
				}
			}
			if(connection!=null){
				connection.disconnect();
				connection = null;
			}
		}
		return null;
	}
	/**
	 * 发送get请求,默认以utf-8获得请求后的字符集
	 * @param urlName 请求路径
	 * @param param 请求参数应该是 name1=value1&name2=value2 的形式。
	 * @return
	 * @throws InterruptedException 
	 * @throws IOException 
	 * @throws IOException
	 */
	public static String sendGet(String urlName, String param) {
		return HttpRequest.sendGet(urlName, param,null,null);
	}
	/**
	 * 发送get请求
	 * @param urlName 请求路径
	 * @return
	 * @throws InterruptedException 
	 * @throws IOException 
	 * @throws IOException
	 */
	public static String sendGet(String urlName) {
		return HttpRequest.sendGet(urlName, null,null,null);
	}
	public static String sendGet(String urlName,Object param,String cookie) {
		return HttpRequest.sendGet(urlName, null,cookie,null);
	}

	/**************************POST请求**********************************/
	/**
	 * 向指定 URL 发送POST方法的请求
	 * @param url 发送请求的 URL
	 * @param param 请求参数，请求参数应该是 name1=value1&name2=value2 的形式,或者是Map类型
	 * @param charset 获取数据采用的字符集编码，默认UTF-8
	 * @return 响应结果
	 * @throws IOException 
	 * @throws InterruptedException 线程中断异常
	 */
	@SuppressWarnings("unchecked")
	public static String sendPost(String url, Object param,String cookie ,String charset){
		if(charset==null){
			charset = "UTF-8";
		}
		StringBuffer sb = new StringBuffer();
		HttpURLConnection connection = null;
		BufferedReader br = null;
		OutputStream os  = null;
		InputStream is = null;
		InputStreamReader ir = null;
		try {
			URL realUrl = new URL(url);
			// 打开和URL之间的连接
			connection = (HttpURLConnection) realUrl.openConnection();
			// 设置通用的请求属性  
			connection.setConnectTimeout(60000);//60秒
			connection.setReadTimeout(60000);
			connection.setRequestMethod("POST");
			// 设置通用的请求属性
			connection.setRequestProperty("accept", "*/*");
			connection.setRequestProperty("connection", "Keep-Alive");
			//设置cookie
			if(cookie!=null){
				connection.setRequestProperty("Cookie",cookie);
			}
			//数据被编码为名称/值对
			connection.setRequestProperty("Content-Type", "application/json");
			connection.setDefaultUseCaches(false);
			// 发送POST请求必须设置如下两行
			connection.setDoOutput(true);
			connection.setDoInput(true);
			if(param!=null){
				os = connection.getOutputStream();
				// 获取URLConnection对象对应的输出流
				PrintWriter out = new PrintWriter(os);
				String myParam = "";
				if(param instanceof Map){
					Map<Object,Object> paramsMap = (Map<Object, Object>) param;
					for (Entry<Object, Object> entry : paramsMap.entrySet()) {
						if(myParam!=""){
							myParam+="&";
						}
						myParam+=(String.valueOf(entry.getKey())+"="+String.valueOf(entry.getValue()));
					}
				}else if(param instanceof String) {
					myParam = param.toString();
				}else{
					Field[] fs = param.getClass().getDeclaredFields();
					for (int i = 0; i < fs.length; i++) {
						Field f = fs[i];
			            f.setAccessible(true);
			            Object v= f.get(param);
			            if(v!=null) {
			            	myParam += f.getName()+"="+String.valueOf(v)+"&";
			            }
					}
				}
				System.out.println(myParam);
				// 发送请求参数
				out.print(myParam);
				// flush输出流的缓冲
				out.flush();
				out.close();
				os.flush();
				os.close();
			}
			is = connection.getInputStream();
			ir = new InputStreamReader(is,charset);
			// 定义BufferedReader输入流来读取URL的响应
			br = new BufferedReader(ir);
			/*while(!br.ready()){//数据量大时，等待数据传输完毕
				Thread.sleep(500);
			}*/
			String line = null;
			while ((line = br.readLine()) != null) {
				sb.append(line+"\r\n");
			}
			return sb.toString();
		}catch (Exception e) {
			e.printStackTrace();
			LOG.error("",e);
		}finally{
			// 释放资源
			if(br!=null){
				try {
					br.close();
					br = null;
				} catch (IOException e) {
					LOG.error("",e);
				}
			}
			if(ir!=null){
				try {
					ir.close();
					ir = null;
				} catch (IOException e) {
					LOG.error("",e);
				}
			}
			if(is!=null){
				try {
					is.close();
					is = null;
				} catch (IOException e) {
					LOG.error("",e);
				}
			}
			if(connection!=null){
				connection.disconnect();
				connection = null;
			}
		}
		return null;
	}
	/**
	 * 
	 * @param url 发送请求的 URL
	 * @param param 请求参数，请求参数应该是 name1=value1&name2=value2 的形式,或者是Map类型
	 * @return 响应结果
	 * @throws IOException
	 * @throws InterruptedException
	 */
	public static String sendPost(String url, Object param){
		return sendPost(url,param,null,null);
	}
	public static String sendPost(String url, Object param,String cookie){
		return sendPost(url,param,cookie,null);
	}
	/**
	 * 直接发送URL
	 * @param url
	 * @return 响应结果
	 * @throws IOException
	 * @throws InterruptedException
	 */
	public static String sendPost(String url){
		return sendPost(url,null,null);
	}
}
