package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Questão 01
        System.out.println("QUESTÃO 01");
        System.out.print("O valor da variável SOMA é ");
        SumCalc.calculateSum();

        // Questão 02
        System.out.println("\nQUESTÃO 02");
        System.out.println("Insira um número para saber se pertence à sequência Fibonacci:");
        int num = scanner.nextInt();
        scanner.nextLine();

        if (FibonacciCalc.belongsToFibonacci(num)) {
            System.out.println("O número " + num + " pertence à sequência Fibonacci");
        } else {
            System.out.println("O número " + num + " não pertence à sequência Fibonacci");
        }

        // Questão 05
        System.out.println("\nQUESTÃO 05");
        System.out.println("Digite uma palavra ou frase para invertê-la:");
        String str = scanner.nextLine();
        System.out.println("Texto invertido: " + Inverter.reverseString(str));
    }
}