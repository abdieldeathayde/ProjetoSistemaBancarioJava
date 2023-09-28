package com.projeto.banco;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ContaBancaria contaBancaria1 = new ContaBancaria();
		int opcao = 0;
		
		
		System.out.println("Você gostaria:");
		System.out.println("0 - Sair");
		System.out.println("1 - Depositar");
        System.out.println("2 - Sacar");
        System.out.println("3 - Exibir Extrato");
        
        
        opcao = sc.nextInt();
		sc.nextLine();

		switch(opcao) {
		case 0:
			System.out.println("Fim do programa!");
			break;
		case 1:
			System.out.print("Digite o valor para depositar: ");
			int deposito = sc.nextInt();
			sc.nextLine();
			contaBancaria1.depositar(deposito);
//			System.out.println("Saldo: R$ " + contaBancaria1.depositar());
			break;
		case 2:
			System.out.print("Digite o valor para sacar: ");
			int saque = sc.nextInt();
			sc.nextLine();
			contaBancaria1.sacar(saque);
//			System.out.println("Saldo: R$ " + contaBancaria1.sacar(saque));
			break;
	} 
		sc.close();
	}	

} // class Main
