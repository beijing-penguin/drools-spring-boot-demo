package com.fescotech.business.drools.entity.vo;

import java.util.List;

public class PdProductAttr {

	private String corpId;
	private String pdId;
	private List<PdAttrVo> pdAttr;

	public boolean containPdAttr(String attrId,String attrVal) {
		for (int i = 0; i < pdAttr.size(); i++) {
			PdAttrVo pdAttrVo = pdAttr.get(i);
			if(attrId.equals(pdAttrVo.getAttrId()) && attrVal.equals(pdAttrVo.getAttrVal())) {
				return true;
			}
		}
		return false;
	}

	public String getPdId() {
		return pdId;
	}
	public void setPdId(String pdId) {
		this.pdId = pdId;
	}
	public List<PdAttrVo> getPdAttr() {
		return pdAttr;
	}
	public void setPdAttr(List<PdAttrVo> pdAttr) {
		this.pdAttr = pdAttr;
	}
	public String getCorpId() {
		return corpId;
	}
	public void setCorpId(String corpId) {
		this.corpId = corpId;
	}
}
