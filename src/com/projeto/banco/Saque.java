package com.projeto.banco;

import java.util.Scanner;

public class Saque {
	public Saque() {
		super();
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Main main2 = new Main();
		int saques = 0;
		double valor;
		System.out.println("Digite a quantia a ser sacada \n");
		valor = sc.nextDouble();
		if (valor < main2.limite && saques < main2.LIMITESAQUES) {
			main2.saldo -= valor;
			// main2.extratos = {"" + saldo};
			// System.out.println(extratos);
			System.out.println("Valor do saque: " + valor);
			sc.close();
		} else {
			System.out.println("Erro! Saldo inválido!");
		}
		
		System.out.println("Obrigado por utilizar Meu sistema!");
		Main.main(args);
	}
}
