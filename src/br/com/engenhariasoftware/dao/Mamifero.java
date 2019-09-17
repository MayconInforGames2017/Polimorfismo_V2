package br.com.engenhariasoftware.dao;

public abstract class Mamifero extends Animal {

	private int patas;

	private String velocidade;

	public Mamifero() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getPatas() {
		return patas;
	}

	public void setPatas(int patas) {
		this.patas = patas;
	}

	public String getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(String velocidade) {
		this.velocidade = velocidade;
	}

	public void vertebrados() {

	}

}
