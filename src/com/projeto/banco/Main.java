package com.projeto.banco;

import java.util.*;

public class Main {
	int limite = 500;
	int saldo = 0;
	int LIMITESAQUES = 3;

	public static void main(String[] args) {

		System.out.println("Seja bem vindo(a) \n \n Você gostaria: \n \n1 - Depositar \n2 - Sacar \n3 - Exibir Extrato \n4 - Sair");
		Scanner sc = new Scanner(System.in);
		int opcao = sc.nextInt();

		while (opcao != 4) {

			if (opcao == 1) {
				Deposito.main(args);
			} else if (opcao == 2) {
				Saque.main(args);
				;
			} else if (opcao == 3) {
				Extrato.main(args);
			} else {
				break;
			}
			sc.close();
		}
	}

} // class Main
