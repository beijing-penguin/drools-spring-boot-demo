package com.fescotech.business.drools;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * drools基础教程：
 * 		https://github.com/MyHerux/drools-springboot
 * 		Drools5&jBPM5详尽教程（自学笔记整理）.docx
 * drools fusion
 * 		Drools-Fusion-用户指南-中文.pdf
 * drools实际使用案例
 * 		安全技术架构说明书.pptx
 * @author dc
 *
 */
@SpringBootApplication
public class SpringBootDemoApplication {
	
	/**
	 * 规则过滤
	 * 规格产品，规格属性，产品id---定价信息--drools-->生产产品信息
	 * 公司定价规则
	 * 产品id-
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		SpringApplication.run(SpringBootDemoApplication.class, args);
	}
}
