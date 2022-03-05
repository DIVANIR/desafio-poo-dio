package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria {
    private String title;
    private String description;
    private LocalDate inicio;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getInicio() {
        return inicio;
    }

    public void setInicio(LocalDate inicio) {
        this.inicio = inicio;
    }

    @Override
    public String toString() {

        return "Curso{" +
                "titulo='" + title + "'," +
                "descrição='" + description + "'," +
                "Data='" + inicio + "'" +
                "}";
    }

}
