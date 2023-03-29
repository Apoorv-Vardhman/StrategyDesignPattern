package com.strategy.design.test2;

/**
 * @author : Apoorva Raj
 * @mailto : apoorv.vardhman@gmail.com
 * @LinkedIn : apoorv-vardhman
 **/
public class AppTest {
    public static void main(String[] args) {
        MessageConverter messageConverter = new MessageConverter();
        messageConverter.writeMessage("Welcome to strategy design pattern");
    }
}
