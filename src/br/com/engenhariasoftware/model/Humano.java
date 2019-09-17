package br.com.engenhariasoftware.model;

import br.com.engenhariasoftware.dao.Mamifero;

public class Humano extends Mamifero {

	public Humano() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void domir() {
		System.out.println(" dormi até 9 horas por dia.");

	}

	@Override
	public void comer() {
		System.out.println(" come de tudo um pouco.");

	}

	@Override
	public void andar() {
		System.out.println(" anda varias ruas.");

	}

	@Override
	public void correr() {
		System.out.println(" faz maratona.");

	}

	@Override
	public void vertebrados() {
		System.out.println(" é um vertebrado.");

	}

}
