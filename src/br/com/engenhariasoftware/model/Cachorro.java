package br.com.engenhariasoftware.model;

import br.com.engenhariasoftware.dao.Mamifero;

public class Cachorro extends Mamifero {

	public Cachorro() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void domir() {
		System.out.println("Est� dormindo.");

	}

	@Override
	public void comer() {
		System.out.println("Come ra��o.");

	}

	@Override
	public void andar() {
		System.out.println("Anda em 4 patas.");

	}

	@Override
	public void correr() {
		System.out.println("Gosta de corre.");

	}

	@Override
	public void vertebrados() {
		System.out.println("� um animal vertebrado.");

	}

}
