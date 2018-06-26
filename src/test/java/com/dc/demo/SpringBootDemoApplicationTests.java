package com.dc.demo;

import java.util.List;

import org.dc.jdbc.config.JDBCConfig;
import org.dc.jdbc.core.DBHelper;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.fastjson.JSON;
import com.fescotech.business.drools.entity.PdAttr;
import com.fescotech.business.drools.entity.PdInfo;

public class SpringBootDemoApplicationTests {

	public static void main(String[] args) throws Exception {
		DruidDataSource dataSource = new DruidDataSource();
		dataSource.setUsername("na_product");
		dataSource.setPassword("product_pwd");
		dataSource.setUrl("jdbc:oracle:thin:@10.0.75.47:1521:qglm");
		DBHelper dbHelper = new DBHelper(dataSource);
		JDBCConfig.isPrintSqlLog=false;
		List<PdInfo> list = dbHelper.selectList("select *from PD_INFO ",PdInfo.class);
		for (int i = 0; i < list.size(); i++) {
			List<PdAttr> pdAttrList = dbHelper.selectList("select *from PD_ATTR where PD_ID=?",PdAttr.class,list.get(i).getPdId());
			if(pdAttrList!=null) {
				for (int j = 0; j < pdAttrList.size(); j++) {
					System.out.println(list.get(i).getPdId()+"-"+pdAttrList.get(j).getAttrName()+"-"+pdAttrList.get(j).getStdAttrId());
					//List<PdAttr> PD_STD_ATTRList = dbHelper.selectList("select * from PD_STD_ATTR where STD_ATTR_ID=?",PdAttr.class,pdAttrList.get(j).getStdAttrId());
				}
			}
		}
		System.out.println(JSON.toJSONString(list));
	}

}
