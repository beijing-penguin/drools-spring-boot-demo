package com.dc.demo;

import org.kie.api.runtime.StatelessKieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dc.demo.entity.Person;

/**
 * 
 * @author dc
 *
 */
@RestController
public class TestController {
	
	@Autowired
	private StatelessKieSession kieSession;
	
	
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
		kieSession.execute(p);
		return p;
	}
}
