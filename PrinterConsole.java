package com.company.io;

public class PrinterConsole implements Printer {

    @Override
    public void print(double number) {
        System.out.println(number);
    }

    @Override
    public void print(String text) {
        System.out.println(text);
    }
}
