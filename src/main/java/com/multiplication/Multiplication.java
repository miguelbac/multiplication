package com.multiplication;

public class Multiplication {
    public int n = 0;

    public void printTable() {
        for (int i = 0; i <= 10; i++) {
            final int product = n * i;
            System.out.println(n + " x " + i + " = " + product);
        }
    }
}
