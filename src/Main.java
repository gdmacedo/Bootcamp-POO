import java.time.LocalDate;

import Dominio.Curso;
import Dominio.Mentoria;
import Dominio.Dev;
import Dominio.Bootcamp;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();

        curso1.setTitulo("Curso Pascal");
        curso1.setDescricao("Dewcrição do curso de Pascal");
        curso1.setCoordenador("Maria Aparecida Verdiana");
        curso1.setCargaHoraria(18);

        Curso curso2 = new Curso();
        curso2.setTitulo("Cobol");
        curso2.setDescricao("Cobol Fujitsu para Mainframe");
        curso2.setCoordenador("Valdemar da Maria de José");
        curso2.setCargaHoraria(80);

        Curso curso3 = new Curso();
        curso3.setTitulo("DB2");
        curso3.setDescricao("Banco de Dados IBM DB2");
        curso3.setCoordenador("João José Maria");
        curso3.setCargaHoraria(70);


        System.out.println("\n--------------------------------[Relação de Cursos]-------------------------------------------");
        System.out.println("\nCurso 1: "+curso1+"");
        System.out.println("\nCurso 2: "+curso2+"");
        System.out.println("\nCurso 3: "+curso3+"");
        System.out.println("\n-----------------------------------------------------------------------------------------------");


        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Desenvolvendo Sistemas com Cobol - I");
        mentoria1.setDescricao("Cobol sendo aplicado no ...");
        mentoria1.setCoordenador("Karolina Aline Amanda");
        mentoria1.setData(LocalDate.now());

        Mentoria mentoria2 = new Mentoria();
        mentoria2.setTitulo("Desenvolvendo Sistemas com Cobol - II");
        mentoria2.setDescricao("Imprimindo relatórios e restaurando backup com Cobol ...");
        mentoria2.setCoordenador("Aline de Maria da Aparecida");
        mentoria2.setData(LocalDate.now());

        System.out.println("\n--------------------------------[Relação de Mentorias]*********--------------------------------");
        System.out.println("\nMentoria 1: "+mentoria1+"");
        System.out.println("\nMentoria 2: "+mentoria2+"");
        System.out.println("\n-----------------------------------------------------------------------------------------------");

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Dabase III-Plus");
        bootcamp.setDescricao("SGBD - Ssitema de Gerenciamento de Banco de Dados aplicado a...");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devKatarina = new Dev();
        devKatarina.setNome("Katarina Maria Erika");
        devKatarina.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Katarina:" + devKatarina.getConteudosInscritos());
        System.out.println("XP:" + devKatarina.calcularTotalXp());
        devKatarina.progredir();
        devKatarina.progredir();
        System.out.println("-----------------------------------------------------------------------------------------\n");
        System.out.println("Conteúdos Inscritos Katarina:" + devKatarina.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Katarina:" + devKatarina.getConteudosConcluidos());
        System.out.println("XP:" + devKatarina.calcularTotalXp());


        Dev devAntonio = new Dev();
        devAntonio.setNome("Antônio Luiz Matheus");
        devAntonio.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Antônio:" + devAntonio.getConteudosInscritos());
        System.out.println("XP:" + devAntonio.calcularTotalXp());
        devAntonio.progredir();
        devAntonio.progredir();
        devAntonio.progredir();
        System.out.println("---------------------------------------------------------------------------------------\n");
        System.out.println("Conteúdos Inscritos Antônio:" + devAntonio.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Antônio:" + devAntonio.getConteudosConcluidos());
        System.out.println("XP:" + devAntonio.calcularTotalXp());




    }

}
