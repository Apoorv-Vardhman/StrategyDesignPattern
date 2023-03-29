package com.strategy.design.test;

import com.strategy.design.test2.MessageConverter;

/**
 * @author : Apoorva Raj
 * @mailto : apoorv.vardhman@gmail.com
 * @LinkedIn : apoorv-vardhman
 **/
public class AppTest {
    public static void main(String[] args) {
        MessageConverter messageConverter = new MessageConverter();
        messageConverter.writeMessage("Welcome to Strategy design patter");
    }
}
