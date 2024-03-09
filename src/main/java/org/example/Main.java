package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Questão 01
        System.out.print("O valor da variável SOMA é ");
        SumCalc.calculateSum();

        // Questão 02
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira um número para saber se pertence à sequência Fibonacci:");
        int num = scanner.nextInt();

        if (FibonacciCalc.belongsToFibonacci(num)) {
            System.out.println("O número " + num + " pertence à sequência Fibonacci");
        } else {
            System.out.println("O número " + num + " não pertence à sequência Fibonacci");
        }
    }
}