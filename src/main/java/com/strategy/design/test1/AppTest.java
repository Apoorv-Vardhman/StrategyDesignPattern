package com.strategy.design.test1;

/**
 * @author : Apoorva Raj
 * @mailto : apoorv.vardhman@gmail.com
 * @LinkedIn : apoorv-vardhman
 **/
public class AppTest {
    public static void main(String[] args) {
        MessageWriter messageWriter = new MessageWriter();
        messageWriter.writeMessage("Welcome to strategy design pattern");
    }
}
