package com.strategy.design.test3;

/**
 * @author : Apoorva Raj
 * @mailto : apoorv.vardhman@gmail.com
 * @LinkedIn : apoorv-vardhman
 **/
public class HtmlConverterImpl implements IMessageConverter {
    @Override
    public String convert(String message) {
        return "<html>"+message+"</html>";
    }
}
