package br.com.engenhariasoftware.model;

import br.com.engenhariasoftware.dao.Mamifero;

public class Gato extends Mamifero {

	public Gato() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void domir() {
		System.out.println("Dorme o dia todo, pois a noite est� farrando.");

	}

	@Override
	public void comer() {
		System.out.println("Come ra��o e animais pequenos.");

	}

	@Override
	public void andar() {
		System.out.println("Anda em 4 patas.");

	}

	@Override
	public void correr() {
		System.out.println("Corre atr�s de rato.");

	}

	@Override
	public void vertebrados() {
		System.out.println("� um animal vertebrado.");

	}

}
