package com.fescotech.business.drools.entity;

import java.util.List;

public class Product {
	private String pdId;
	private String corpId;//公司id
	private String paymentMethod;//单立户，大库
	private String paymentInsurance;//单立户，大库
	private Integer havePayroll;//是否有工资条
	public List<String> priceList;
	
	
	public List<String> getPriceList() {
		return priceList;
	}
	public void setPriceList(List<String> priceList) {
		this.priceList = priceList;
	}
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
