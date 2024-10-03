package Estagio_Ribeirao_Preto;

/* Você está em uma sala com três interruptores, cada um conectado a uma lâmpada
em salas diferentes. Você não pode ver as lâmpadas da sala em que está,
mas pode ligar e desligar os interruptores quantas vezes quiser. Seu objetivo é descobrir
qual interruptor controla qual lâmpada. Como você faria para descobrir, usando apenas duas idas
 até uma das salas das lâmpadas, qual interruptor controla cada lâmpada? */

public class Exercicio_5 {
    public static void main(String[] args) {
        System.out.println("Primeiro passo (ligar interruptores):\n" +
                "\n" +
                "Ligaria o primeiro interruptor e deixava ligado por alguns minutos (cerca de 5 minutos).\n" +
                "Enquanto o primeiro interruptor está ligado, desligaria o segundo interruptor.\n" +
                "Mantendo o terceiro interruptor desligado desde o início.\n" +
                "Primeira ida à sala das lâmpadas:\n" +
                "\n" +
                "Após os 5 minutos, iria até a sala das lâmpadas.\n" +
                "Verificaria as lâmpadas assim:\n" +
                "A lâmpada que está acesa é controlada pelo primeiro interruptor que deixei ligado.\n" +
                "A lâmpada que está apagada, mas quente é controlada pelo segundo interruptor que deixei ligado.\n" +
                "A lâmpada que está apagada e fria é controlada pelo terceiro interruptor que ficou desligado o tempo todo.");
    }
}
