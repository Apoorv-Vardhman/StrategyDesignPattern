package com.strategy.design.test;

/**
 * @author : Apoorva Raj
 * @mailto : apoorv.vardhman@gmail.com
 * @LinkedIn : apoorv-vardhman
 **/
public class MessageConverter {
    public void writeMessage(String message){
        HtmlConverter htmlConverter = new HtmlConverter();
        String cMessage  = htmlConverter.convert(message);
        System.out.println(cMessage);
    }
}
