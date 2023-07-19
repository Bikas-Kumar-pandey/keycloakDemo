package com.keycloak.interview;

public class ArrayValues {

    public static void main(String[] args) {
        int[] a = new int[]{10, 20, 30, 80};
        int[] b = new int[]{70, 80, 90, 10};

        for (int i = 0; i < a.length; i++) {

            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j])
                    System.out.println("Common values are " + b[j]);
            }
        }

    }

}
