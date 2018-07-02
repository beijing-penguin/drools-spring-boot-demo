package com.dc.demo;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.util.List;

import org.dc.jdbc.config.JDBCConfig;
import org.dc.jdbc.core.ConnectionManager;
import org.dc.jdbc.core.DBHelper;
import org.dc.jdbc.core.pojo.ColumnBean;
import org.dc.jdbc.core.pojo.TableInfoBean;

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
		/*Connection conn = dataSource.getConnection();
		DatabaseMetaData meta = dataSource.getConnection().getMetaData();
		ResultSet tablesResultSet = meta.getTables(conn.getCatalog(), "na_product".toUpperCase(), "%", new String[] { "TABLE" });
		while (tablesResultSet.next()) {
			TableInfoBean tableBean = new TableInfoBean();
			String tableName = tablesResultSet.getString("TABLE_NAME");
			ResultSet colRS = meta.getColumns(conn.getCatalog(), "%", tableName, "%");
			tableBean.setTableName(tableName);
			while (colRS.next()) {
				ColumnBean colbean = new ColumnBean();
				String colName = colRS.getString("COLUMN_NAME");
				colbean.setColumnType(colRS.getInt("DATA_TYPE"));
				colbean.setColumnName(colName);
				tableBean.getColumnList().add(colbean);
			}
			// 设置主键
			ResultSet primaryKeyResultSet = meta.getPrimaryKeys(conn.getCatalog(), null, tableName);
			while (primaryKeyResultSet.next()) {
				String primaryKeyColumnName = primaryKeyResultSet.getString("COLUMN_NAME");
				for (int i = 0; i < tableBean.getColumnList().size(); i++) {
					ColumnBean colbean = tableBean.getColumnList().get(i);
					if (colbean.getColumnName().equals(primaryKeyColumnName)) {
						System.out.println(111);
						colbean.setPrimaryKey(true);
						break;
					}
				}
			}
		}*/
		ConnectionManager.setTransaction(true);
		ConnectionManager.setReadOnly(false);
		DBHelper dbHelper = new DBHelper(dataSource);
		PdAttr attr = new PdAttr();
		attr.setAttrId("PPATT_0000000001");
		attr.setAttrInfo("社保代缴服务有缴费方式");
		int row = dbHelper.updateEntity(attr);
		if(row==1) {
			ConnectionManager.commitAll();
			//ConnectionManager.closeConnectionAll();
		}
		
		/*for (int i = 0; i < list.size(); i++) {
			List<PdAttr> pdAttrList = dbHelper.selectList("select *from PD_ATTR where PD_ID=?",PdAttr.class,list.get(i).getPdId());
			if(pdAttrList!=null) {
				for (int j = 0; j < pdAttrList.size(); j++) {
					System.out.println(list.get(i).getPdId()+"-"+pdAttrList.get(j).getAttrName()+"-"+pdAttrList.get(j).getStdAttrId());
					//List<PdAttr> PD_STD_ATTRList = dbHelper.selectList("select * from PD_STD_ATTR where STD_ATTR_ID=?",PdAttr.class,pdAttrList.get(j).getStdAttrId());
				}
			}
		}
		System.out.println(JSON.toJSONString(list));*/
	}

}
