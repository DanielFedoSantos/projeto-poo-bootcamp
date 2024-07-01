import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso 1");
        curso1.setDescricao("Curso 1 desc");
        curso1.setCargaHoraria(10);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso 2");
        curso2.setDescricao("Curso 2 desc");
        curso2.setCargaHoraria(15);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria 1");
        mentoria.setDescricao("Mentoria 1 desc");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp 1");
        bootcamp.setDescricao("Bootcamp 1 desc");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev dev1 = new Dev();
        dev1.setNome("Dev 1");
        dev1.inscreverBootcamp(bootcamp);
        System.out.println(dev1.getConteudosInscritos());
        dev1.progredir();
        dev1.progredir();
        dev1.progredir();
        System.out.println("Concluidos: " + dev1.getConteudosConcluidos());
        System.out.println(dev1.getConteudosInscritos());
        System.out.println(dev1.calcularTotalXp());

        Dev dev2 = new Dev();
        dev2.setNome("Dev 2");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println(dev2.getConteudosInscritos());
        dev2.progredir();
        System.out.println("Concluidos: " + dev2.getConteudosConcluidos());
        System.out.println(dev2.getConteudosInscritos());
        System.out.println(dev2.calcularTotalXp());

    }
}