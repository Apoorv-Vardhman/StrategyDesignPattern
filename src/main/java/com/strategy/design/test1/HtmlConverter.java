package com.strategy.design.test1;

/**
 * @author : Apoorva Raj
 * @mailto : apoorv.vardhman@gmail.com
 * @LinkedIn : apoorv-vardhman
 **/
public class HtmlConverter implements IMessageConverter{
    public String convert(String message) {
        return "<html>"+message+"</html>";
    }
}
