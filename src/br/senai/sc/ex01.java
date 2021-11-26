package br.senai.sc;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class ex01 {

    public static void main(String[] args) {
        LocalTime hora = LocalTime.now();
        String saudacao = "%s, no momento são %s%n";
        String periodo = "";
        String atual = hora.getHour() + ":" + hora.getMinute();

        if (hora.isAfter(LocalTime.of(4, 59)) && hora.isBefore(LocalTime.of(12, 00))) {
            periodo = "Bom dia";
        } else if (hora.isAfter(LocalTime.of(11, 59)) && hora.isBefore(LocalTime.of(18, 00))) {
            periodo = "Boa tarde";
        } else if (hora.isAfter(LocalTime.of(17, 59)) && hora.isBefore(LocalTime.of(5, 00))) {
            periodo = "Boa noite";
        }

        System.out.format(saudacao, periodo, atual);


    }

}
