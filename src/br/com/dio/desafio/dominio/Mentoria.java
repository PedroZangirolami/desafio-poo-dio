package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria {
	
	private String titulo;
	private String dscricao;
	private LocalDate data;
	
	public Mentoria() {	}

	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String getDescricao() {
		return dscricao;
	}
	
	public void setDescricao(String dscricao) {
		this.dscricao = dscricao;
	}
	
	public LocalDate getData() {
		return data;
	}
	
	public void setData(LocalDate data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Mentoria [titulo=" + titulo + ", dscricao=" + dscricao + ", data=" + data + "]";
	}
	
	
}
