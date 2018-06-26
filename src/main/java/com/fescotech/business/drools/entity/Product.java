package com.fescotech.business.drools.entity;

public class Product {
	private String pdId;
	private String corpId;//公司id
	private String paymentMethod;//单立户，大库
	private String paymentInsurance;//单立户，大库
	private Integer payroll;//单立户，大库
	
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
	public Integer getPayroll() {
		return payroll;
	}
	public void setPayroll(Integer payroll) {
		this.payroll = payroll;
	}
}
