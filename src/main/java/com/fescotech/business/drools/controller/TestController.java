package com.fescotech.business.drools.controller;

import java.util.ArrayList;
import java.util.List;

import org.kie.api.runtime.StatelessKieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fescotech.business.drools.entity.Person;
import com.fescotech.business.drools.entity.XiaoMing;
import com.fescotech.business.drools.entity.dto.ApiResponse;
import com.fescotech.business.drools.entity.vo.PdProductAttr;

/**
 * 
 * @author dc
 *
 */
@RestController
public class TestController {

	@Autowired
	private StatelessKieSession statelessKieSession;

	/**
	 * 执行某个特定的rule规则 这里ruleId=1
	 * 执行规则中 执行testSevice.getUser方法，此方法查询数据库或者做其他业务逻辑 
	 * @return
	 */
	@RequestMapping("/test1")
	public Person test1() {
		Person p = new Person();
		p.setAge(31);
		p.setRuleId(1);
		statelessKieSession.execute(p);
		return p;
	}
	@RequestMapping("/test2")
	public XiaoMing test2() {
		XiaoMing xiaoMing = new XiaoMing();
		xiaoMing.setMoney(20);
		statelessKieSession.execute(xiaoMing);
		return xiaoMing;
	}

	/*@RequestMapping("/test3")
	public List<Person> test3() {
		QueryResults results = kieSession.getQueryResults("query-1");
		List<Person> list = new ArrayList<>();
		for(QueryResultsRow row : results){
			Person person = (Person) row.get("$person");
			list.add(person);
		}
		kieSession.dispose();
		kieSession=null;
		return list;
	}*/
	@RequestMapping(value="/productQuotation" )
	
	public ApiResponse productQuotation(@RequestBody(required=false) PdProductAttr pdProductAttr) {
		List<String> products = new ArrayList<String>();
		statelessKieSession.setGlobal("products", products);
		statelessKieSession.execute(pdProductAttr);
		return new ApiResponse(true, products);
	}
}
