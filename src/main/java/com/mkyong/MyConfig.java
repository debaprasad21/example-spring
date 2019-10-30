package com.mkyong;

import org.apache.logging.log4j.ThreadContext;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {
    @Value("${value}")
    private String value;

    @Bean
    void setLogger(){
        ThreadContext.put("VALUE",value);
    }
}
