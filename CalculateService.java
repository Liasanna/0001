package com.company.service;

import com.company.exception.DividingByZeroException;

public interface CalculateService {
    double calculate(double a, double b) throws DividingByZeroException, DividingByZeroException;
}
