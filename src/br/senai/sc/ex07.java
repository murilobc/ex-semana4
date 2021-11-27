package br.senai.sc;

import java.util.Scanner;

public class ex07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] ordinal = {"Primeira", "Segunda", "Terceira"};
        double total = 0.0;

        for (int i = 0; i < ordinal.length; i++) {
            System.out.printf("%n%s nota: ", ordinal[i]);
            total += Double.valueOf(input.nextLine());
        }

        double media = total / 3;
        System.out.printf("%nSua média final é: %.2f", media);
    }
}
