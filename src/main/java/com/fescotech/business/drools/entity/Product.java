package com.fescotech.business.drools.entity;

public class Product {
	private String pdId;
	private String corpId;//公司id
	private String paymentMethod;//单立户，大库(1,2)
	private String paymentInsurance;//单立户，大库(1,12,4,)
	private Integer havePayroll;//是否有工资条
	
	
	public String getPdId() {
		return pdId;
	}
	public void setPdId(String pdId) {
		this.pdId = pdId;
	}
	public String getPaymentMethod() {
		return paymentMethod;
	}
	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
	public String getPaymentInsurance() {
		return paymentInsurance;
	}
	public void setPaymentInsurance(String paymentInsurance) {
		this.paymentInsurance = paymentInsurance;
	}
	public String getCorpId() {
		return corpId;
	}
	public void setCorpId(String corpId) {
		this.corpId = corpId;
	}
	public Integer getHavePayroll() {
		return havePayroll;
	}
	public void setHavePayroll(Integer havePayroll) {
		this.havePayroll = havePayroll;
	}
	
}
