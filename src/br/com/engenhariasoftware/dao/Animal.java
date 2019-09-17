package br.com.engenhariasoftware.dao;

public abstract class Animal implements Reino {

	private String nome;
	private int peso;
	private int altura;
	private boolean racional;

	public Animal() {
	}

	public boolean isRacional() {
		return racional;
	}

	public void setRacional(boolean racional) {
		this.racional = racional;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}
	
	public void dormir() {
		System.out.println();
	}

}
