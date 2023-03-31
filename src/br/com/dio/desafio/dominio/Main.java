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
		mentoria.setDescricao("descricao mentoria java");
		mentoria.setData(LocalDate.now());
		
		System.out.println(curso1);
		System.out.println(curso2);
		System.out.println(mentoria);
	}
	
}