package com.company.io;

public class PrinterStars implements Printer {

    @Override
    public void print(double number){
        for (int j = 0; j < number; j++) {
            print("*");
        }
        System.out.println();
    }

    @Override
    public void print(String text) {
        System.out.print(text);
    }
}
