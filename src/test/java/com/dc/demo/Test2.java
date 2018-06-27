package com.dc.demo;

import com.fescotech.business.drools.entity.Product;
import com.fescotech.business.drools.utils.HttpRequest;

public class Test2 {
	public static void main(String[] args) {
		Product p =new Product();
		p.setPdId("PDINF_0000000001");
		p.setPaymentMethod("1,2");
		p.setPaymentInsurance("1,2,3,4,5");
		//System.out.println(HttpRequest.sendPost("http://localhost:8080/business/drools/productQuotation", p));
		
		System.out.println(HttpRequest.sendPost("http://10.0.45.102:8080/business/drools/productQuotation","{\"corpId\":\"gongsiID\",\"pdAttr\":[{\"attrId\":\"PPATT_0000000002\",\"attrVal\":\"1\"},{\"attrId\":\"PPATT_0000000001\",\"attrVal\":\"1\"}],\"pdId\":\"PDINF_0000000001\"}"));
	}
}
