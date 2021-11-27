package br.senai.sc;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Informe sua data de nascimento (formato 'd/MM/yyyy'): ");
        String dtNascimento = input.nextLine();

        LocalDate hoje = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");
        LocalDate nasc = LocalDate.parse(dtNascimento, formatter);

        int idade = Period.between(nasc, hoje).getYears();

        if (idade >= 18) {
            System.out.println("\nVocê é maior de idade");
        } else {
            System.out.println("\nVocê é menor de idade");
        }
    }
}
