package com.strategy.design.test2;

/**
 * @author : Apoorva Raj
 * @mailto : apoorv.vardhman@gmail.com
 * @LinkedIn : apoorv-vardhman
 **/
public class HtmlMessageConverterImpl implements IMessageConverter{

    @Override
    public String convert(String message) {
        return "<html>"+message+"</html>";
    }
}
