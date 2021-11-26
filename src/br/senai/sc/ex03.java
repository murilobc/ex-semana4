package br.senai.sc;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ex03 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("ATENÇÃO: Utilize pelo menos duas casas após a virgula para os valores");
        System.out.print("Informe sua altura: ");
        double altura = Double.valueOf(input.nextLine());
        System.out.print("\nInforme seu peso: ");
        double peso = Double.valueOf(input.nextLine());

        double imc = peso / (altura * altura);

        System.out.printf("%nSeu IMC: %.2f", imc);

    }

}
