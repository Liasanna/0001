package com.company.io;

public interface Data extends Reader, Printer {
    default double input(String text) {
        print(text);
        return read();
    }
}
