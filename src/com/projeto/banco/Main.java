package com.projeto.banco;

import java.util.Scanner;

public class Main {
	int limite = 500;
	int saldo = 0;
	int LIMITESAQUES = 3;
	

	public static void main(String[] args) {

		while (true) {
			Scanner sc = new Scanner(System.in);
			ContaBancaria conta = new ContaBancaria();
			int opcao;
		
		
			System.out.println("Você gostaria:");
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Exibir Extrato");
            System.out.println("4 - Sair");
            
			opcao = sc.nextInt();
			sc.nextLine();

			

			if (opcao == 1) {
				double deposito = conta.depositar();
				System.out.println("Valor depositado: " + deposito);
				break;
				
			} else if (opcao == 2) {
				conta.sacar();
				break;
				
			} else if (opcao == 3) {
				conta.verExtrato();
				break;
				
			} else {
				System.out.println("Sessão encerrada! Obrigado por usar meu sistema");
				break;
			
			}
			
		}
		
	}

} // class Main
