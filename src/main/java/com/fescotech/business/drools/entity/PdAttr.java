package com.fescotech.business.drools.entity;

import java.math.BigDecimal;
import java.util.Date;

import org.dc.jdbc.core.pojo.Table;

/**
 * 功能描述:
 * @param: 产品属性定义表
 * @return: 
 * @auther: YangZehong
 * @date: 2018/5/14 16:42
 */
public class PdAttr {
	public static String ID_PREFIX = "PPATT_";
	public static String SEQ = "SEQ_PD_ATTR";
	/**
	 * 产品属性ID
	 */
	private String attrId; 
	
	/**
	 * 标准属性ID
	 */
	private String stdAttrId; 
	
	/**
	 * 产品ID
	 */
	private String pdId; 
	
	/**
	 * 属性编码(参数名)
	 */
	private String attrCode; 
	
	/**
	 * 属性中文名
	 */
	private String attrName; 
	
	/**
	 * 属性中文描述
	 */
	private String attrInfo; 
	
	/**
	 * 产品属性类型(PD_ATTR_TYPE)： 1、产品属性   2、报价属性  3、订单属性
	 */
	private BigDecimal attrType; 
	
	/**
	 * 属性输入类型(INPUT_TYPE)1、文本域    2、日期    3、多行文本  4、下拉框    5、复选框 6、单选  7、富文本
	 */
	private BigDecimal inputType; 
	
	/**
	 * 属性数据类型(DATA_TYPE)1、文本   2、整数   3、浮点数    4、日期
	 */
	private BigDecimal dataType; 
	
	/**
	 * 对于文本数据，取其最大长度
	 */
	private BigDecimal dataLength; 
	
	/**
	 * 小数位数
	 */
	private BigDecimal dataScale; 
	
	/**
	 * 是否通用要素(YES_NO) 1、是  2、否，所有产品实例都一样
	 */
	private BigDecimal commonFlag; 
	
	/**
	 * 是否规格要素(YES_NO) 1、是  2、否，可以用作区分不同的产品实例
	 */
	private BigDecimal specifFlag;
	
	/**
	 * 是否定价要素(YES_NO) 1、是  2、否
	 */
	private BigDecimal priceFlag; 
	
	/**
	 * 是否唯一(YES_NO)1、是   2、否
	 */
	private BigDecimal uniqFlag; 
	
	/**
	 * 备注
	 */
	private String remark; 
	
	/**
	 * 最小值
	 */
	private String minVal; 
	
	/**
	 * 最大值
	 */
	private String maxVal; 
	
	/**
	 * 产品验证规则(PD_CHECK_RULE)
	 */
	private BigDecimal checkRule; 
	
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
	 * 读取产品属性ID
	 */
	public String getAttrId(){
		return attrId;
	} 
	
	/**
	 * 设置 产品属性ID
	 */
	public void setAttrId(String attrId){
		this.attrId = attrId;
	}
	
	/**
	 * 读取标准属性ID
	 */
	public String getStdAttrId(){
		return stdAttrId;
	} 
	
	/**
	 * 设置 标准属性ID
	 */
	public void setStdAttrId(String stdAttrId){
		this.stdAttrId = stdAttrId;
	}
	
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
	 * 读取属性编码(参数名)
	 */
	public String getAttrCode(){
		return attrCode;
	} 
	
	/**
	 * 设置 属性编码(参数名)
	 */
	public void setAttrCode(String attrCode){
		this.attrCode = attrCode;
	}
	
	/**
	 * 读取属性中文名
	 */
	public String getAttrName(){
		return attrName;
	} 
	
	/**
	 * 设置 属性中文名
	 */
	public void setAttrName(String attrName){
		this.attrName = attrName;
	}
	
	/**
	 * 读取属性中文描述
	 */
	public String getAttrInfo(){
		return attrInfo;
	} 
	
	/**
	 * 设置 属性中文描述
	 */
	public void setAttrInfo(String attrInfo){
		this.attrInfo = attrInfo;
	}
	

	
	public BigDecimal getAttrType() {
		return attrType;
	}

	public void setAttrType(BigDecimal attrType) {
		this.attrType = attrType;
	}

	public BigDecimal getInputType() {
		return inputType;
	}

	public void setInputType(BigDecimal inputType) {
		this.inputType = inputType;
	}

	public BigDecimal getDataType() {
		return dataType;
	}

	public void setDataType(BigDecimal dataType) {
		this.dataType = dataType;
	}

	public BigDecimal getDataLength() {
		return dataLength;
	}

	public void setDataLength(BigDecimal dataLength) {
		this.dataLength = dataLength;
	}

	public BigDecimal getDataScale() {
		return dataScale;
	}

	public void setDataScale(BigDecimal dataScale) {
		this.dataScale = dataScale;
	}

	public BigDecimal getCommonFlag() {
		return commonFlag;
	}

	public void setCommonFlag(BigDecimal commonFlag) {
		this.commonFlag = commonFlag;
	}

	public BigDecimal getSpecifFlag() {
		return specifFlag;
	}

	public void setSpecifFlag(BigDecimal specifFlag) {
		this.specifFlag = specifFlag;
	}

	public BigDecimal getPriceFlag() {
		return priceFlag;
	}

	public void setPriceFlag(BigDecimal priceFlag) {
		this.priceFlag = priceFlag;
	}

	public BigDecimal getUniqFlag() {
		return uniqFlag;
	}

	public void setUniqFlag(BigDecimal uniqFlag) {
		this.uniqFlag = uniqFlag;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getMinVal() {
		return minVal;
	}

	public void setMinVal(String minVal) {
		this.minVal = minVal;
	}

	public String getMaxVal() {
		return maxVal;
	}

	public void setMaxVal(String maxVal) {
		this.maxVal = maxVal;
	}

	public BigDecimal getCheckRule() {
		return checkRule;
	}

	public void setCheckRule(BigDecimal checkRule) {
		this.checkRule = checkRule;
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

	  
	    /* (非 Javadoc)  
	    *   
	    *   
	    * @return  
	    * @see java.lang.Object#toString()  
	    */  
	    
	@Override
	public String toString() {
		return "PdAttr [attrId=" + attrId + ", stdAttrId=" + stdAttrId + ", pdId=" + pdId + ", attrCode=" + attrCode
				+ ", attrName=" + attrName + ", attrInfo=" + attrInfo + ", attrType=" + attrType + ", inputType="
				+ inputType + ", dataType=" + dataType + ", dataLength=" + dataLength + ", dataScale=" + dataScale
				+ ", commonFlag=" + commonFlag + ", specifFlag=" + specifFlag + ", priceFlag=" + priceFlag
				+ ", uniqFlag=" + uniqFlag + ", remark=" + remark + ", minVal=" + minVal + ", maxVal=" + maxVal
				+ ", checkRule=" + checkRule + ", validFlag=" + validFlag + ", creId=" + creId + ", creTime=" + creTime
				+ "]";
	}
	
	
}
