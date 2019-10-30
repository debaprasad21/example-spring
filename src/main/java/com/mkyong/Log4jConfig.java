package com.mkyong;

import org.apache.logging.log4j.ThreadContext;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.event.ApplicationEnvironmentPreparedEvent;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Bean;

public class Log4jConfig implements ApplicationListener<ApplicationEnvironmentPreparedEvent> {

    @Value("${value}")
    private String value;


    @Override
    public void onApplicationEvent(ApplicationEnvironmentPreparedEvent applicationEnvironmentPreparedEvent) {
        ThreadContext.put("VALUE",value);
    }
}
