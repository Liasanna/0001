package com.company;

import com.company.exception.DividingByZeroException;
import com.company.io.*;
import com.company.controller.Controller;
import com.company.service.*;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) throws FileNotFoundException, DividingByZeroException {
        //File file = new File("numbers.txt");

        Reader reader = new ReaderConsole(new Scanner(System.in));
        Printer printer = new PrinterConsole();

        Controller controller = new Controller();
        Data data = new DataIO(reader,printer);

        CalculateService sumService = new SumService();
        CalculateService divideService = new DivideService();
        CalculateService subtractService = new SubtractService();
        CalculateService multiplyService = new MultiplyService();

        controller.init(data);
        controller.calc(multiplyService);
        controller.done(data);
    }
}
