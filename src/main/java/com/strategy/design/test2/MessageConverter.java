package com.strategy.design.test2;

/**
 * @author : Apoorva Raj
 * @mailto : apoorv.vardhman@gmail.com
 * @LinkedIn : apoorv-vardhman
 **/
public class MessageConverter {
    IMessageConverter messageConverter;
    public void writeMessage(String message) {
        String cMessage = null;
        messageConverter = MessageConverterFactory.newMessageConverter("html");
        cMessage = messageConverter.convert(message);
        System.out.println(cMessage);
    }
}
