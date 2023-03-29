package com.strategy.design.test3;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * @author : Apoorva Raj
 * @mailto : apoorv.vardhman@gmail.com
 * @LinkedIn : apoorv-vardhman
 **/
public class ObjectFactory {
    public static Object newObject(String lClassname) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        Properties props = new Properties();

        props.load(new FileInputStream("/home/embedtechl2/Downloads/Apoorv/target/spring/SpringPractice/StrategyDesignPattern/src/main/resources/appClasses.properties"));
        String fqnClass = props.getProperty(lClassname);

        Class<?> clazz = Class.forName(fqnClass);
        return clazz.newInstance();
    }
}
