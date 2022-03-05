
import java.time.LocalDate;

import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) throws Exception {

        Curso curso = new Curso();
        curso.setDescription("description");
        curso.setTitle("setTitle");
        curso.setWorkload(6);

        Mentoria mentoria = new Mentoria();
        mentoria.setDescription("description");
        mentoria.setTitle("title");
        mentoria.setInicio(LocalDate.now());

        System.out.println(curso);
        System.out.println(mentoria);
    }
}
