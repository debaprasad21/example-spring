package com.mkyong;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

//https://docs.spring.io/spring-boot/docs/current/reference/html/howto-logging.html
@RestController
public class HelloController {

    private static final Logger logger = LogManager.getLogger(HelloController.class);

    private List<Integer> num = Arrays.asList(1, 2, 3, 4, 5);

    @GetMapping("/")
    public String main() {

        // pre-java 8
        if (logger.isDebugEnabled()) {
            logger.debug("Hello from Log4j 2 - num : {}", num);
        }

        // java 8 lambda, no need to check log level
        logger.debug("Hello from Log4j 2 - num : {}", () -> num);


        return "welcome"; //view
    }

    private int getNum() {
        return 100;
    }

}
