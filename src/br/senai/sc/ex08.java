package br.senai.sc;

import java.util.Scanner;

public class ex08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Informe o primeiro número: ");
        double num1 = Double.valueOf(input.nextLine());
        System.out.print("\nInforme o segundo número: ");
        double num2 = Double.valueOf(input.nextLine());
        System.out.print("\nDigite '1' para somar\nDigite '2' para subtrair" +
                "\nDigite '3' para multiplicar\nDigite '4' para dividir\nEscolha uma opção: ");
        int opcao = Integer.valueOf(input.nextLine());

        double resultado = 0.0;

        switch (opcao) {
            case 1:
                resultado = num1 + num2;
                break;
            case 2:
                resultado = num1 - num2;
                break;
            case 3:
                resultado = num1 * num2;
                break;
            case 4:
                resultado = num1 / num2;
                break;
            default:
                System.out.println("\nVocê não escolheu uma opção válida");
        }

        System.out.printf("%nResultado: %.2f", resultado);
    }
}
