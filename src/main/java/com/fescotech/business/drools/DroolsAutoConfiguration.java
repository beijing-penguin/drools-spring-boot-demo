package com.fescotech.business.drools;

import java.io.IOException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
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

import com.fescotech.business.drools.service.TestService;

@Configuration
public class DroolsAutoConfiguration {
	private static Log log = LogFactory.getLog(DroolsAutoConfiguration.class);
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
        	log.info("正在加载规则文件"+file.getFile().getAbsolutePath());
        	helper.addResource(ResourceFactory.newClassPathResource(RULES_PATH + file.getFilename(), "UTF-8"));
        }
        KieContainer kContainer = helper.getKieContainer();
        
        
        StatelessKieSession kieSession = kContainer.newStatelessKieSession();
        kieSession.setGlobal("testService", testService);
        return kieSession;
    }
}