package com.company.service;

public class SubtractService implements CalculateService{
    @Override
    public double calculate(double a, double b) {
        return a - b;
    }
}
