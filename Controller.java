package com.company.controller;

import com.company.exception.DividingByZeroException;
import com.company.io.Data;
import com.company.io.Printer;
import com.company.service.CalculateService;

public class Controller {

    double a, b, sum;

    public void init(Data data) {
        a = data.input("Enter a: ");
        b = data.input("Enter b: ");
    }


    public void calc(CalculateService service) throws DividingByZeroException {
        sum = service.calculate(a, b);
    }


    public void done(Printer printer) {
        printer.print("Result: ");
        printer.print(sum);
    }
}
