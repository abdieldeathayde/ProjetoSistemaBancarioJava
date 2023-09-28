package com.projeto.banco;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ContaBancaria {
	Scanner sc = new Scanner(System.in);
	
	int limite = 500;
	int saldo;
	int LIMITESAQUES = 3;
	
//	ContaBancaria conta = new ContaBancaria();

	
	public int depositar(int deposito) {

//		System.out.println("Digite a quantia a ser depositada: ");
//
//		double valor = 0;
//
//		valor = sc.nextDouble();
//		sc.nextLine();
		
		System.out.println("Valor do depósito: " + deposito);
		
		
		sc.close();

		return deposito;

	}

//	public void verOpcoes() {
//		
//		
//		
//		Scanner sc = new Scanner(System.in);
//		
////		ContaBancaria conta = new ContaBancaria();
//		
//		while (true) {
//
//			
//			int opcao;
//
//			System.out.println("Você gostaria:");
//			System.out.println("1 - Depositar");
//			System.out.println("2 - Sacar");
//			System.out.println("3 - Exibir Extrato");
//			System.out.println("4 - Sair");
//
//			opcao = sc.nextInt();
//			sc.nextLine();
//
//			if (opcao == 1) {
//				double deposito = conta.depositar();
//				System.out.println("Valor depositado: " + deposito);
//				break;
//
//			} else if (opcao == 2) {
//				conta.sacar();
//				break;
//
//			} else if (opcao == 3) {
//				conta.verExtrato();
//				break;
//
//			} else {
//				System.out.println("Sessão encerrada! Obrigado por usar meu sistema");
//				break;
//
//			}
//
//		}
//		sc.close();
//
//	}

	public int sacar(int saque) {
		ContaBancaria conta = new ContaBancaria();

		int saldo2 = conta.limite;
//		int saques = 0;
//		double valor = depositar(saldo2);

//		System.out.println("Digite a quantia a ser sacada \n");

//		valor = sc.nextDouble();
//		sc.nextLine();
		
		int limite2 = conta.limite;
		int LIMITE = conta.LIMITESAQUES;

		if (saldo2 < limite2 && saque < LIMITE) {
			
			saldo2 -= saque;
			verExtrato().add("Valor do saque: " + saque);
			System.out.println(verExtrato());
			
		} else {
			System.out.println("Erro! Saldo inválido!");
		}
		sc.close();
		System.out.println("Obrigado por utilizar Meu sistema!");
//		Main.main(args);
		return saque;

	}

	public ArrayList<String> verExtrato() {
		List<String> extratos = new ArrayList<String>();
		extratos.clear();

		for (int i = 0; i < extratos.size(); i++) {
			System.out.println(extratos);
		}

		return (ArrayList<String>) extratos;

	}
}


