package org.example;

public class SumCalc {
    public static void calculateSum() {
        int index = 13, sum = 0, k = 0;

        while (k < index) {
            k = k + 1;
            sum = sum + k;
        }

        System.out.println(sum);
    }
}
