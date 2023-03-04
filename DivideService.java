package com.company.service;

import com.company.exception.DividingByZeroException;

public class DivideService implements CalculateService{
    @Override
    public double calculate(double a, double b) throws DividingByZeroException {
        if(b == 0) {
            throw new DividingByZeroException("Dividing by zero is forbidden!");
        }
        return a / b;
    }
}
