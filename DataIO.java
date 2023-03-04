package com.company.io;


public class DataIO implements Data {
    private final Reader reader;
    private final Printer printer;

    public DataIO(Reader reader, Printer printer){
        this.reader = reader;
        this.printer = printer;
    }


    @Override
    public void print(String text) {
        printer.print(text);
    }

    @Override
    public void print(double number){
        printer.print(number);
    }

    @Override
    public double read(){
        return reader.read();
    }

}
