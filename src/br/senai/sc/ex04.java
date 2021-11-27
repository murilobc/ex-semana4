package br.senai.sc;

import java.util.Scanner;

public class ex04 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Informe um numero inteiro: ");
        int numero = Integer.valueOf(input.nextLine());

        if (numero % 2 == 0) {
            System.out.println("\nVocê Informou um número par");
        } else {
            System.out.println("\nVocê Informou um número impar");
        }
    }
}
