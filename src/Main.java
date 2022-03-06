
import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Content;
import br.com.dio.desafio.dominio.Course;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentorship;

public class Main {
    public static void main(String[] args) throws Exception {

        Course course1 = new Course();
        course1.setDescription("description");
        course1.setTitle("setTitle");
        course1.setWorkload(6);

        Mentorship mentorship = new Mentorship();
        mentorship.setDescription("description");
        mentorship.setTitle("title");
        mentorship.setInicio(LocalDate.now());

        Content course2 = new Course();
        course2.setDescription("description course2");
        course2.setTitle("setTitle course2");

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setName("Bootcamp Java Developer");
        bootcamp.setDescription("Descrição Bootcamp Java Developer");
        bootcamp.getContents().add(course1);
        bootcamp.getContents().add(mentorship);
        bootcamp.getContents().add(course2);

        Dev dev = new Dev();
        dev.setName("Divanir de jesus");
        dev.bootcampRegister(bootcamp);
        dev.progress();

        System.out.println("------------------------------------");
        System.out.println("Dev: " + dev.getName());
        System.out.println("Conteudos inscritos: " + dev.getContentRegistered());
        System.out.println("Conteudos concluidos: " + dev.getContentConcluded());
        System.out.println("XP: " + dev.calculateTotalXP());

    }
}
