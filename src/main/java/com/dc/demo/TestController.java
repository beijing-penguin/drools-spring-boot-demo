package com.dc.demo;

import org.kie.api.runtime.StatelessKieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dc.demo.entity.Person;


@RestController
public class TestController {
	@Autowired
	private StatelessKieSession kieSession;
	
	@RequestMapping("/test1")
	public Person test1() {
		Person p = new Person();
		p.setAge(31);
		kieSession.execute(p);
		return p;
	}
}
