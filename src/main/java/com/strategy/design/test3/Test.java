package com.strategy.design.test3;

import java.io.IOException;

/**
 * @author : Apoorva Raj
 * @mailto : apoorv.vardhman@gmail.com
 * @LinkedIn : apoorv-vardhman
 **/
public class Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        MessageWriter messageWriter = (MessageWriter) ObjectFactory.newObject("messageWriter.class");
        IMessageConverter iMessageConverter = (IMessageConverter) ObjectFactory.newObject("messageConverter.class");
        messageWriter.setIMessageConverter(iMessageConverter);
        messageWriter.writeMessage("Welcome to strategy design pattern");
    }
}
