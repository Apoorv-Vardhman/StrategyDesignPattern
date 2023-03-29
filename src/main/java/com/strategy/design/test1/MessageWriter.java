package com.strategy.design.test1;


/**
 * @author : Apoorva Raj
 * @mailto : apoorv.vardhman@gmail.com
 * @LinkedIn : apoorv-vardhman
 **/
public class MessageWriter {
    IMessageConverter messageConverter;
    void writeMessage(String message) {
        String cMessage = null;
        messageConverter = new HtmlConverter();
        cMessage = messageConverter.convert(message);
        System.out.println(cMessage);
    }
}
