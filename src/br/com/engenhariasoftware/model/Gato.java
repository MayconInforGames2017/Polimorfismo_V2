package br.com.engenhariasoftware.model;

import br.com.engenhariasoftware.dao.Mamifero;

public class Gato extends Mamifero {

	public Gato() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void domir() {
		System.out.println("Dorme o dia todo, pois a noite está farrando.");

	}

	@Override
	public void comer() {
		System.out.println("Come ração e animais pequenos.");

	}

	@Override
	public void andar() {
		System.out.println("Anda em 4 patas.");

	}

	@Override
	public void correr() {
		System.out.println("Corre atrás de rato.");

	}

	@Override
	public void vertebrados() {
		System.out.println("É um animal vertebrado.");

	}

}
