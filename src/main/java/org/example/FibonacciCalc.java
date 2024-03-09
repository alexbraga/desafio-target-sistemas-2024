package org.example;

public class FibonacciCalc {
    public static boolean belongsToFibonacci(int num) {
        int firstNumber = 0, secondNumber = 1;

        if (num == firstNumber || num == secondNumber) {
            return true;
        }

        while (secondNumber < num) {
            int sum = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = sum;
        }

        return secondNumber == num;
    }
}
