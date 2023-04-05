package com.goit;


public class SumCalculator {

    int sum(int n){
        if (n <= 0) throw new IllegalArgumentException("invalid data");
        int suma = 0;
        for (int i = 1; i <= n ; i++) {
            suma = suma + i;
        }
        return suma;
    }
}
