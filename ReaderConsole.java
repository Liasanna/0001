package com.company.io;

import java.util.Scanner;

public class ReaderConsole implements Reader{
    private final Scanner scanner;

    public ReaderConsole(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public double read() {
        return scanner.nextInt();
    }
}
