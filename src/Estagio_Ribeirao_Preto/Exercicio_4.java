package Estagio_Ribeirao_Preto;

/* Descubra a lógica e complete o próximo elemento:
a) 1, 3, 5, 7, ___
b) 2, 4, 8, 16, 32, 64, ____
c) 0, 1, 4, 9, 16, 25, 36, ____
d) 4, 16, 36, 64, ____
e) 1, 1, 2, 3, 5, 8, ____
f) 2,10, 12, 16, 17, 18, 19, ____ */

public class Exercicio_4 {
    public static void main(String[] args) {

        System.out.println("\n" +
                "a) 1, 3, 5, 7, ___\n" +
                "   Lógica: A sequência é composta de números ímpares consecutivos.\n" +
                "   Próximo elemento: 9\n" +
                "\n" +
                "b) 2, 4, 8, 16, 32, 64, ____\n" +
                "   Lógica: Cada número é o dobro do anterior (multiplicação por 2).\n" +
                "   Próximo elemento: 128\n" +
                "\n" +
                "c) 0, 1, 4, 9, 16, 25, 36, ____\n" +
                "   Lógica: A sequência segue os quadrados perfeitos (números ao quadrado: 0^2, 1^2, 2^2, 3^2, 4^2, 5^2, 6^2).\n" +
                "   Próximo elemento: 49 (que é 7^2)\n" +
                "\n" +
                "d) 4, 16, 36, 64, ____\n" +
                "   Lógica: A sequência segue os quadrados de números pares (2^2, 4^2, 6^2, 8^2).\n" +
                "   Próximo elemento: 100 (que é 10^2)\n" +
                "\n" +
                "e) 1, 1, 2, 3, 5, 8, ____\n" +
                "   Lógica: Sequência de Fibonacci, onde cada número é a soma dos dois anteriores.\n" +
                "   Próximo elemento: 13 (5 + 8 = 13)\n" +
                "\n" +
                "f) 2, 10, 12, 16, 17, 18, 19, ____\n" +
                "   Lógica: Após o número 10, a sequência continua de forma consecutiva, exceto que o número 11 foi pulado.\n" +
                "   Próximo elemento: 20\n" +
                "   \n");
    }
}
