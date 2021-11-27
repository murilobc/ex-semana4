package br.senai.sc;

import java.util.Scanner;

public class ex09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Informe um numero inteiro de 0 a 10: ");
        int num = Integer.valueOf(input.nextLine());
        int resultado = 1;

        if (num < 0 || num > 10) {
            System.out.print("\nVocê não informou um numero válido");
            resultado = 0;
        } else {
            for (int i = 1; i <= num; i++) {
                resultado *= i;
            }
        }

        System.out.printf("%nResultado: %d", resultado);
    }
}
