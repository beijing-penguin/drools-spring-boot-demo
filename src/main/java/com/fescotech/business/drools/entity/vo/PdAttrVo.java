package com.fescotech.business.drools.entity.vo;

public class PdAttrVo {
	
	private String attrId;
	
	private String attrVal;

	
	public PdAttrVo() {}
	public PdAttrVo(String attrId, String attrVal) {
		this.attrId = attrId;
		this.attrVal = attrVal;
	}

	public String getAttrId() {
		return attrId;
	}

	public void setAttrId(String attrId) {
		this.attrId = attrId;
	}

	public String getAttrVal() {
		return attrVal;
	}

	public void setAttrVal(String attrVal) {
		this.attrVal = attrVal;
	}
	
}
