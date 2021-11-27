package br.senai.sc;

import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero = (int)  (Math.random() * (6-1) + 1);
        System.out.println("Adivinhe qual número de 1 a 5 eu estou pensando?");
        int chute = Integer.valueOf(input.nextLine());

        if (chute < 1 || chute > 5) {
            System.out.println("Você não informou um número entre 1 e 5");
        } else if (chute == numero) {
            System.out.println("Você acertou!");
        } else {
            System.out.printf("Você errou, o número correto era %d", numero);
        }


    }
}
