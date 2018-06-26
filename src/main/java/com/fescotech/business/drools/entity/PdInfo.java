package com.fescotech.business.drools.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 功能描述:
 * @param: 产品定义信息表
 * @return:
 * @auther: YangZehong
 * @date: 2018/5/14 16:42
 */
public class PdInfo {
	public static String ID_PREFIX = "PDINF_";
	public static String SEQ = "SEQ_PD_INFO";
	/**
	 * 产品ID
	 */
	private String pdId; 
	
	/**
	 * 产品分类(PD_CATE)：1、社保   2、公积金  3、代发工资  4、福利产品  5、其他产品
	 */
	private BigDecimal pdCate; 
	
	/**
	 * 产品编码
	 */
	private String pdCode; 
	
	/**
	 * 产品中文名称
	 */
	private String pdName; 
	
	/**
	 * 排列顺序
	 */
	private BigDecimal serial; 
	
	/**
	 * 产品描述信息
	 */
	private String pdInfo; 
	
	/**
	 * 服务内容模板
	 */
	private String template; 
	
	/**
	 * 备注说明
	 */
	private String remark; 
	
	/**
	 * 是否启用(YES_NO)1是2否
	 */
	private BigDecimal openFlag; 
	
	/**
	 * 是否有效(YES_NO)1是2否
	 */
	private BigDecimal validFlag; 
	
	/**
	 * 操作人
	 */
	private String creId; 
	
	/**
	 * 创建时间
	 */
	private Date creTime; 
	
	
	/**
	 * 读取产品ID
	 */
	public String getPdId(){
		return pdId;
	} 
	
	/**
	 * 设置 产品ID
	 */
	public void setPdId(String pdId){
		this.pdId = pdId;
	}
	
	
	/**
	 * 读取产品编码
	 */
	public String getPdCode(){
		return pdCode;
	} 
	
	/**
	 * 设置 产品编码
	 */
	public void setPdCode(String pdCode){
		this.pdCode = pdCode;
	}
	
	/**
	 * 读取产品中文名称
	 */
	public String getPdName(){
		return pdName;
	} 
	
	/**
	 * 设置 产品中文名称
	 */
	public void setPdName(String pdName){
		this.pdName = pdName;
	}
	
	
	
	public BigDecimal getSerial() {
		return serial;
	}

	public void setSerial(BigDecimal serial) {
		this.serial = serial;
	}

	/**
	 * 读取产品描述信息
	 */
	public String getPdInfo(){
		return pdInfo;
	} 
	
	/**
	 * 设置 产品描述信息
	 */
	public void setPdInfo(String pdInfo){
		this.pdInfo = pdInfo;
	}
	
	/**
	 * 读取服务内容模板
	 */
	public String getTemplate(){
		return template;
	} 
	
	/**
	 * 设置 服务内容模板
	 */
	public void setTemplate(String template){
		this.template = template;
	}
	
	/**
	 * 读取备注说明
	 */
	public String getRemark(){
		return remark;
	} 
	
	/**
	 * 设置 备注说明
	 */
	public void setRemark(String remark){
		this.remark = remark;
	}
	
	
	
	public BigDecimal getOpenFlag() {
		return openFlag;
	}

	public void setOpenFlag(BigDecimal openFlag) {
		this.openFlag = openFlag;
	}

	
	
	public BigDecimal getValidFlag() {
		return validFlag;
	}

	public void setValidFlag(BigDecimal validFlag) {
		this.validFlag = validFlag;
	}

	/**
	 * 读取操作人
	 */
	public String getCreId(){
		return creId;
	} 
	
	/**
	 * 设置 操作人
	 */
	public void setCreId(String creId){
		this.creId = creId;
	}
	
	/**
	 * 读取创建时间
	 */
	public Date getCreTime(){
		return creTime;
	} 
	
	/**
	 * 设置 创建时间
	 */
	public void setCreTime(Date creTime){
		this.creTime = creTime;
	}

	public BigDecimal getPdCate() {
		return pdCate;
	}

	public void setPdCate(BigDecimal pdCate) {
		this.pdCate = pdCate;
	}
	
	
}
