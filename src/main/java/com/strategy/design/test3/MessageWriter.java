package com.strategy.design.test3;


/**
 * @author : Apoorva Raj
 * @mailto : apoorv.vardhman@gmail.com
 * @LinkedIn : apoorv-vardhman
 **/
public class MessageWriter {
    IMessageConverter iMessageConverter;
    void writeMessage(String message){
        System.out.println(iMessageConverter.convert(message));
    }

    public void setIMessageConverter(IMessageConverter iMessageConverter) {
        this.iMessageConverter = iMessageConverter;
    }
}
