package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {
	
	public static void main(String[] args) {
		
		Curso curso1 = new Curso();
		curso1.setTitulo("descricao curso java");
		curso1.setDescricao("curso java");
		curso1.setCargaHoraria(8);		

		Curso curso2 = new Curso();
		curso2.setTitulo("descricao curso js");
		curso2.setDescricao("curso js");
		curso2.setCargaHoraria(4);		
		
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("mentoria java");
		mentoria.setDescricao("desc ricao mentoria java");
		mentoria.setData(LocalDate.now());
		
		//System.out.println(curso1);
		//System.out.println(curso2);
		//System.out.println(mentoria);
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Descrição Bootcamp Java Developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		Dev devPedro = new Dev();
		devPedro.setNome("Pedro");
		devPedro.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos Inscritos Pedro: " + devPedro.getConteudosInscritos());
		devPedro.progredir();
		devPedro.progredir();
		System.out.println("-");
		System.out.println("Conteudos Inscritos Pedro: " + devPedro.getConteudosInscritos());
		System.out.println("Conteudos Concluidos Pedro: " + devPedro.getConteudosConcluidos());
		System.out.println("XP> " + devPedro.calcularTotalXp());
		
		System.out.println("---------");
		
		Dev devJoao = new Dev();
		devJoao.setNome("João");
		devJoao.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos Inscritos Joao" + devJoao.getConteudosInscritos());
		devJoao.progredir();
		devJoao.progredir();
		devJoao.progredir();
		System.out.println("-");
		System.out.println("Conteudos Inscritos Joao" + devJoao.getConteudosInscritos());
		System.out.println("Conteudos Concluidos Joao" + devJoao.getConteudosConcluidos());
		System.out.println("XP> " + devJoao.calcularTotalXp());
	}
	
}
