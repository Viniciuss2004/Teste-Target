package Estagio_Ribeirao_Preto;

/* Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e
o próximo valor sempre será a soma dos 2 valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um programa na linguagem que desejar onde, informado um número, ele calcule a sequência de Fibonacci e retorne uma mensagem avisando se o número informado pertence ou não a sequência.

IMPORTANTE: Esse número pode ser informado através de qualquer entrada de sua preferência ou pode ser previamente definido no código;*/

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        ArrayList<Integer> fibonacciSequence = generateFibonacciSequence(num);

        if (fibonacciSequence.contains(num)) {
            System.out.println("O número " + num + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + num + " não pertence à sequência de Fibonacci.");
        }
        System.out.println("Sequência de Fibonacci até " + num + ": " + fibonacciSequence);
    }

    public static ArrayList<Integer> generateFibonacciSequence(int limit) {
        ArrayList<Integer> sequence = new ArrayList<>();
        int a = 0, b = 1;

        sequence.add(a);

        while (b <= limit) {
            sequence.add(b);
            int next = a + b;
            a = b;
            b = next;
        }
        return sequence;
    }
}
