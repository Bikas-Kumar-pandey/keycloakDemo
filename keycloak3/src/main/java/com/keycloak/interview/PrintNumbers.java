package com.keycloak.interview;

public class PrintNumbers {

    public static void printNumbersFromOneToHundred(int n) {
        if (n <= 100) {
            System.out.println(n);
            printNumbersFromOneToHundred(n + 1);
        }
    }

    public static void main(String[] args) {
        printNumbersFromOneToHundred(1);
    }

}
