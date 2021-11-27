package br.senai.sc;

import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Informe um valor inteiro inicial: ");
        int inicio = Integer.valueOf(input.nextLine());
        System.out.print("\nInforme a raiz: ");
        int raiz = Integer.valueOf(input.nextLine());

        System.out.print("\nDigite '1' para Progressão Aritmética" +
                "\nDigite '2' para Progressão Geométrica\nEscolha a opção: ");
        int opcao = Integer.valueOf(input.nextLine());
        int resultado = inicio;
        System.out.printf("%n%d", inicio);

        switch (opcao) {
            case 1:
                for (int i = 0; i < 10; i++) {
                    resultado += raiz;
                    System.out.printf(", %d", resultado);
                }
                break;
            case 2:
                for (int i = 0; i < 10; i++) {
                    resultado *= raiz;
                    System.out.printf(", %d", resultado);
                }
                break;
            default:
                System.out.print("\nVocê não selecionou uma opção válida");
        }
    }
}
