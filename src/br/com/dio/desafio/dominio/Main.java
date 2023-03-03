package br.com.dio.desafio.dominio;
import java.time.LocalDate;

public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {
        
        Curso curso1 = new Curso();
        curso1.setTitulo("curso Java");
        curso1.setDescricao("descrição curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso JavaScript");
        curso2.setDescricao("descrição curso JavaScript");
        curso2.setCargaHoraria(8);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

    /*  System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria); */

        Bootcamp bootcamp = new Bootcamp(); // criando o bootcamp
        bootcamp.setNome ("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1); // trazendo o conteúdo para o bootcamp
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);
        
        Dev devCamila = new Dev(); // criando o primeiro participante
        devCamila.setNome("Camila"); // cadastrando
        devCamila.inscreverBootcamp(bootcamp); // inscrevendo no bootcamp
        System.out.println("Conteúdos inscritos Camila: " + devCamila.getConteudosInscritos());
        devCamila.progredir(); // finalizando o primeiro curso
        devCamila.progredir(); // finalizando o segundo curso
        System.out.println(" - ");
        System.out.println("Conteúdos inscritos Camila: " + devCamila.getConteudosInscritos());
        System.out.println("Conteúdos concluídos Camila: " + devCamila.getConteudosConcluidos());
        System.out.println("XP: " + devCamila.calcularXp());


        System.out.println(" --------- ");


        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos João: " + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir(); 
        System.out.println(" - ");
        System.out.println("Conteúdos inscritos João: " + devCamila.getConteudosInscritos());
        System.out.println("Conteúdos concluídos João: " + devCamila.getConteudosConcluidos());
        System.out.println("XP: " + devJoao.calcularXp());
    }    
    
}
