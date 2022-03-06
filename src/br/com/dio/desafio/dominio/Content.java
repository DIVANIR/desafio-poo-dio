package br.com.dio.desafio.dominio;

public abstract class Content {

    protected static final double DEFAULT_XP = 10d;

    private String title;
    private String description;

    public abstract double calculateXP();

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

}
