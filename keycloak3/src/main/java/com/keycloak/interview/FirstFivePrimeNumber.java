package com.keycloak.interview;

public class FirstFivePrimeNumber {
    public static void main(String[] args) {

        int count = 0;
        int n = 2;

        while (count < 5) {
            if (printFirstFivePrime(n)) {
                System.out.println(n);
                count++;
            }
            n++;
        }

    }

    public static boolean printFirstFivePrime(int n) {

        if (n <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;

    }
}
