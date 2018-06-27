package com.fescotech.business.drools.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.fescotech.business.drools.entity.vo.PdAttrVo;

@Service
public class BusinessService {
	public boolean containPdAttr(String attrId,String attrVal,List<PdAttrVo> attrVos) {
		
		
		for (int i = 0; i < attrVos.size(); i++) {
			PdAttrVo pdAttrVo = attrVos.get(i);
			if(attrId.equals(pdAttrVo.getAttrId()) && attrVal.equals(pdAttrVo.getAttrVal())) {
				
			}
		}
		return false;
	}
}
