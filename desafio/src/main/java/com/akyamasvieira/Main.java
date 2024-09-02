package com.akyamasvieira;

import java.time.LocalDate;

import com.akyamasvieira.dominio.BootCamp;
import com.akyamasvieira.dominio.Curso;
import com.akyamasvieira.dominio.Dev;
import com.akyamasvieira.dominio.Mentoria;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        Curso curso2 = new Curso();
        Mentoria mentoria = new Mentoria();

        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso Java");
        curso1.setCargaHoraria(8);

        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("Descrição curso JavaScript");
        curso2.setCargaHoraria(8);

        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição Mentoria Java");
        mentoria.setData(LocalDate.now());
    
        BootCamp bootCamp = new BootCamp();
        bootCamp.setNome("BootCamp Java Developer");
        bootCamp.setDescricao("Descrição BootCamp Java Developer");
        bootCamp.getConteudos().add(curso1);
        bootCamp.getConteudos().add(curso2);
        bootCamp.getConteudos().add(mentoria);

        Dev dev1 = new Dev();
        dev1.setNome("Akyama");
        dev1.inscreverBootCamp(bootCamp);
        System.out.println("Conteúdos Inscritos" + dev1.getConteudoInscritos());
        dev1.progredir();
        dev1.progredir();
        System.out.println("_");
        System.out.println("Conteúdos Inscritos" + dev1.getConteudoInscritos());
        System.out.println("Conteúdos Concluídos" + dev1.getConteudoConcluidos());
        System.out.println("XP " + dev1.calcularXp());

        System.out.println("______________");

        Dev dev2 = new Dev();
        dev2.setNome("João");
        dev2.inscreverBootCamp(bootCamp);
        System.out.println("Conteúdos Inscritos" + dev2.getConteudoInscritos()); 
        dev2.progredir();
        System.out.println("_");
        System.out.println("Conteúdos Inscritos" + dev1.getConteudoInscritos());
        System.out.println("Conteúdos Concluídos" + dev2.getConteudoConcluidos()); 
        System.out.println("XP " + dev2.calcularXp());
    }
}   