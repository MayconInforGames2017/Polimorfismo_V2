package br.com.engenhariasoftware.teste;

import java.util.Scanner;

import br.com.engenhariasoftware.dao.Animal;
import br.com.engenhariasoftware.model.Cachorro;
import br.com.engenhariasoftware.model.Gato;
import br.com.engenhariasoftware.model.Humano;

public class Launch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		Animal a = null;
		while (a == null) {
			a = obterOpcao(s);
		}
		s.close();

		if (a instanceof Humano) {
			System.out.println(a.getNome() + " é um humano");
			System.out.println(a.getNome() + " pesar: " + a.getPeso() + " Kg");
			System.out.println(a.getNome() + " tem: " + a.getAltura() + " altura.");

		} else {
			if (a instanceof Cachorro) {
				System.out.println(a.getNome() + " é um cachorro");
				System.out.println(a.getNome() + " pesa: " + a.getPeso() + " Kg");
				System.out.println(a.getNome() + " tem: " + a.getAltura() + " altura");

			} else {
				System.out.println(a.getNome() + " é um gato");
				System.out.println(a.getNome() + " pesa: " + a.getPeso() + " Kg.");
				System.out.println(a.getNome() + " tem: " + a.getAltura() + " centimetros.");
			}
		}

		if (a.isRacional()) {
			System.out.println(a.getNome() + " é um animal racional.");
		} else {
			System.out.println(a.getNome() + " é um animal irracional.");
		}

	}

	private static Animal obterOpcao(Scanner s) {
		System.out.println("[0] Humano | [1] Cachorro | [2] Gato ");
		System.out.println("Informe o animal a ser criado: ");
		int opcao = s.nextInt();
		Animal a = null;
		switch (opcao) {
		case 0:
			a = new Humano();
			a.setRacional(true);
			System.out.println("Informe o nome do Humano: ");
			a.setNome(s.next());
			System.out.println("Informe o peso: ");
			a.setPeso(s.nextInt());
			System.out.println("Informe a altura: ");
			a.setAltura(s.nextInt());
			a.andar();
			a.comer();
			a.correr();
			a.dormir();
			break;
		case 1:
			a = new Cachorro();
			a.setRacional(false);
			System.out.println("Informe o nome do Cachorro: ");
			a.setNome(s.next());
			System.out.println("Informe o peso: ");
			a.setPeso(s.nextInt());
			System.out.println("Informe a altura: ");
			a.setAltura(s.nextInt());
			a.andar();
			a.comer();
			a.correr();
			a.dormir();
			break;
		case 2:
			a = new Gato();
			a.setRacional(false);
			System.out.println("Informe o nome do Gato: ");
			a.setNome(s.next());
			System.out.println("Informe o peso: ");
			a.setPeso(s.nextInt());
			System.out.println("Informe a altura: ");
			a.setAltura(s.nextInt());
			a.andar();
			a.comer();
			a.correr();
			a.dormir();
			break;
		default:
			System.out.println("Opção inválida!");
			break;
		}
		return a;
	} 
}
