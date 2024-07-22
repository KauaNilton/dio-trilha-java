package br.com.dio.desafio;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

// Desafio feito com a especialista Camila Cavalcante || código original https://github.com/cami-la/desafio-poo-dio

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        Curso curso2 = new Curso();

        curso1.setTitulo("Curso java");
        curso1.setDescricao("Descrição curso java");
        curso1.setCargaHoraria(8);

        curso2.setTitulo("Curso js");
        curso2.setDescricao("Descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();

        mentoria.setTitulo("Mentoria de java");
        mentoria.setDescricao("Descrição mentoria de java");


       /* System.out.println(curso1);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição do bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(mentoria);

        Bootcamp bootcamp2 = new Bootcamp();
        bootcamp2.setNome("Bootcamp JS");
        bootcamp2.setDescricao("Descrição do bootcamp JS");
        bootcamp2.getConteudos().add(curso2);

        Dev devKaua = new Dev();
        devKaua.setNome("Kauã");

        devKaua.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Kauã: " + devKaua.getConteudosInscritos());
        devKaua.progredir();

        System.out.println("\n----\n");
        System.out.println("Conteúdos Concluidos Kauã: " + devKaua.getConteudosConcluidos());

        devKaua.progredir();
        System.out.println("Conteúdos inscritos Kauã: " + devKaua.getConteudosInscritos());
        System.out.println("XP: " + devKaua.calcularTotalXp());

        System.out.println("\n------------------------\n");

        Dev devJoao = new Dev();
        devJoao.setNome("João");

        devJoao.inscreverBootcamp(bootcamp2);
        System.out.println("Conteúdos inscritos João: " + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos João: " + devJoao.getConteudosConcluidos());
        devJoao.progredir();
        System.out.println("XP: " + devJoao.calcularTotalXp());
    }
}
