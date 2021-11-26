package br.senai.sc;

import java.util.Scanner;

public class ex02 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Informe seu nome: ");
        String nome = input.nextLine();
        System.out.print("\nInforme seu sobrenome: ");
        String sobrenome = input.nextLine();

        String nomeCompleto = nome + " " + sobrenome;
        System.out.printf("%nSeu nome completo é %s e possui %d caracteres", nomeCompleto, nomeCompleto.length());
    }

}
