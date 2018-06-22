package com.dc.demo;

import java.io.IOException;

import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.StatelessKieSession;
import org.kie.internal.io.ResourceFactory;
import org.kie.internal.utils.KieHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;

import com.dc.demo.service.TestService;

@Configuration
public class DroolsAutoConfiguration {

    private static final String RULES_PATH = "rules/";

    @Autowired
	private TestService testService;
    
    @Bean
    //@ConditionalOnMissingBean(StatelessKieSession.class)
    public StatelessKieSession kieSession() throws IOException {
    	KieHelper helper = new KieHelper();
    	ResourcePatternResolver resourcePatternResolver = new PathMatchingResourcePatternResolver();
    	Resource[] resources = resourcePatternResolver.getResources("classpath*:" + RULES_PATH + "**/*.*");
        for (Resource file : resources) {
        	helper.addResource(ResourceFactory.newClassPathResource(RULES_PATH + file.getFilename(), "UTF-8"));
        }
        KieContainer kContainer = helper.getKieContainer();
        
        
        StatelessKieSession kieSession = kContainer.newStatelessKieSession();
        kieSession.setGlobal("testService", testService);
        return kieSession;
    }
}