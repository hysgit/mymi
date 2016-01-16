package com.woslx.mi.main;

import org.apache.log4j.PropertyConfigurator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.InputStream;

/**
 * Created by Administrator on 2016/1/13.
 */
public class Main {
    private final static Logger logger = LoggerFactory.getLogger(Main.class);
    public static void main(String[] args) {
        InputStream inputStream = Main.class.getClassLoader().getResourceAsStream("log4j.properties");
        PropertyConfigurator.configure(inputStream);
        logger.debug("This is log output");
    }
}
