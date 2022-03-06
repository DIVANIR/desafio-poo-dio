package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

public class Dev {
    private String name;
    private Set<Content> contentRegistered = new LinkedHashSet<>();
    private Set<Content> contentConcluded = new LinkedHashSet<>();

    public void bootcampRegister(Bootcamp bootcamp) {
        bootcamp.getRegisteredDevs().add(this);
        this.contentRegistered.addAll(bootcamp.getContents());
    }

    public void progress() {
        Optional<Content> contents = this.contentRegistered.stream().findFirst();
        if (contents.isPresent()) {
            this.contentConcluded.add(contents.get());
            this.contentRegistered.remove(contents.get());
        } else {
            System.out.println("Você não esta matriculado em nenhum conteudo!");
        }
    }

    public double calculateTotalXP() {
        return this.contentConcluded
                .stream()
                .mapToDouble(content -> content.calculateXP())
                .sum();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Content> getContentRegistered() {
        return contentRegistered;
    }

    public void setContentRegistered(Set<Content> contentRegistered) {
        this.contentRegistered = contentRegistered;
    }

    public Set<Content> getContentConcluded() {
        return contentConcluded;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((contentConcluded == null) ? 0 : contentConcluded.hashCode());
        result = prime * result + ((contentRegistered == null) ? 0 : contentRegistered.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Dev other = (Dev) obj;
        if (contentConcluded == null) {
            if (other.contentConcluded != null)
                return false;
        } else if (!contentConcluded.equals(other.contentConcluded))
            return false;
        if (contentRegistered == null) {
            if (other.contentRegistered != null)
                return false;
        } else if (!contentRegistered.equals(other.contentRegistered))
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }

}
