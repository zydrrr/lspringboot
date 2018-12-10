package com.content;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


@Component
public class Propo {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    public Propo(){}
    public void init(){
        System.out.println("Propo init...");
    }
    public void printProp(){
        System.out.println("pro:");
        System.out.println("hhh");
        logger.debug("Propo debug fuck logg ");
        logger.error(" Propo errororr fuck loggg");
    }
}
