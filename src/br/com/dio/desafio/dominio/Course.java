package br.com.dio.desafio.dominio;

public class Course extends Content {

    private int workload;

    public int getWorkload() {
        return workload;
    }

    public void setWorkload(int workload) {
        this.workload = workload;
    }

    @Override
    public String toString() {

        return "Curso{" +
                "titulo='" + getTitle() + "'," +
                "descrição='" + getDescription() + "'," +
                "cargaHoraria='" + workload + "'" +
                "}";
    }

    @Override
    public double calculateXP() {
        return DEFAULT_XP + 20d;
    }

}
