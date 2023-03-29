package com.strategy.design.test1;

/**
 * @author : Apoorva Raj
 * @mailto : apoorv.vardhman@gmail.com
 * @LinkedIn : apoorv-vardhman
 **/
public class PdfConverter implements IMessageConverter{

    public String convert(String message) {
        return "<pdf>"+message+"</pdf>";
    }
}
