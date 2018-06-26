package com.fescotech.business.drools.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 功能描述:
 * @param: 标准属性定义表
 * @return:
 * @auther: YangZehong
 * @date: 2018/5/14 16:42
 */
public class PdStdAttr {

	public static String ID_PREFIX = "PPSTA_";
	public static String SEQ = "SEQ_PD_STD_ATTR";
	/**
	 * 产品标准属性ID
	 */
	private String stdAttrId; 
	
	/**
	 * 标准属性名称
	 */
	private String stdName; 
	
	/**
	 * 属性描述
	 */
	private String stdInfo; 
	
	/**
	 * 属性输入类型(INPUT_TYPE)1、文本域    2、日期    3、多行文本  4、下拉框    5、复选框 6、单选  7、富文本
	 */
	private BigDecimal inputType; 
	
	/**
	 * 属性数据类型(DATA_TYPE)1、文本   2、整数   3、浮点数    4、日期
	 */
	private Integer dataType; 
	
	/**
	 * 对于文本数据，取其最大长度
	 */
	private Long dataLength; 
	
	/**
	 * 小数位数
	 */
	private Integer dataScale; 
	
	/**
	 * 关联字典类型
	 */
	private String dictType; 
	
	/**
	 * 备注
	 */
	private String remark; 
	
	/**
	 * 排列顺序
	 */
	private Integer serial; 
	
	/**
	 * 是否有效(YES_NO)1是2否
	 */
	private Integer validFlag; 
	
	/**
	 * 操作人
	 */
	private String creId; 
	
	/**
	 * 创建时间
	 */
	private Date creTime; 
	
	
	/**
	 * 读取产品标准属性ID
	 */
	public String getStdAttrId(){
		return stdAttrId;
	} 
	
	/**
	 * 设置 产品标准属性ID
	 */
	public void setStdAttrId(String stdAttrId){
		this.stdAttrId = stdAttrId;
	}
	
	/**
	 * 读取标准属性名称
	 */
	public String getStdName(){
		return stdName;
	} 
	
	/**
	 * 设置 标准属性名称
	 */
	public void setStdName(String stdName){
		this.stdName = stdName;
	}
	
	/**
	 * 读取属性描述
	 */
	public String getStdInfo(){
		return stdInfo;
	} 
	
	/**
	 * 设置 属性描述
	 */
	public void setStdInfo(String stdInfo){
		this.stdInfo = stdInfo;
	}
	
	
	public BigDecimal getInputType() {
		return inputType;
	}

	public void setInputType(BigDecimal inputType) {
		this.inputType = inputType;
	}

	/**
	 * 读取属性数据类型(DATA_TYPE)1、文本   2、整数   3、浮点数    4、日期
	 */
	public Integer getDataType(){
		return dataType;
	} 
	
	/**
	 * 设置 属性数据类型(DATA_TYPE)1、文本   2、整数   3、浮点数    4、日期
	 */
	public void setDataType(Integer dataType){
		this.dataType = dataType;
	}
	
	/**
	 * 读取对于文本数据，取其最大长度
	 */
	public Long getDataLength(){
		return dataLength;
	} 
	
	/**
	 * 设置 对于文本数据，取其最大长度
	 */
	public void setDataLength(Long dataLength){
		this.dataLength = dataLength;
	}
	
	/**
	 * 读取小数位数
	 */
	public Integer getDataScale(){
		return dataScale;
	} 
	
	/**
	 * 设置 小数位数
	 */
	public void setDataScale(Integer dataScale){
		this.dataScale = dataScale;
	}
	
	/**
	 * 读取关联字典类型
	 */
	public String getDictType(){
		return dictType;
	} 
	
	/**
	 * 设置 关联字典类型
	 */
	public void setDictType(String dictType){
		this.dictType = dictType;
	}
	
	/**
	 * 读取备注
	 */
	public String getRemark(){
		return remark;
	} 
	
	/**
	 * 设置 备注
	 */
	public void setRemark(String remark){
		this.remark = remark;
	}
	
	/**
	 * 读取排列顺序
	 */
	public Integer getSerial(){
		return serial;
	} 
	
	/**
	 * 设置 排列顺序
	 */
	public void setSerial(Integer serial){
		this.serial = serial;
	}
	
	/**
	 * 读取是否有效(YES_NO)1是2否
	 */
	public Integer getValidFlag(){
		return validFlag;
	} 
	
	/**
	 * 设置 是否有效(YES_NO)1是2否
	 */
	public void setValidFlag(Integer validFlag){
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
	
	
}
