package com.strategy.design.test2;

/**
 * @author : Apoorva Raj
 * @mailto : apoorv.vardhman@gmail.com
 * @LinkedIn : apoorv-vardhman
 **/
public class MessageConverterFactory {
    static IMessageConverter newMessageConverter(String converterType) { // static factory method
        IMessageConverter messageConverter = null;
        if(converterType.equals("html")) {
            messageConverter = new HtmlMessageConverterImpl();
        }else {
            messageConverter = new PdfConverterImpl();
        }
        return messageConverter;
    }
}
