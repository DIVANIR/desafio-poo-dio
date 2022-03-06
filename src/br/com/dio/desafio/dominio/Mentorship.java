package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentorship extends Content {

    private LocalDate date;

    public LocalDate getInicio() {
        return date;
    }

    public void setInicio(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {

        return "Mentoria{" +
                "titulo='" + getTitle() + "'," +
                "descrição='" + getDescription() + "'," +
                "Data='" + date + "'" +
                "}";
    }

    @Override
    public double calculateXP() {
        return DEFAULT_XP + 20d;
    }

}
