package com.projeto.banco;

import java.util.Scanner;

public class Deposito {
	
	public static double valores() {

		System.out.println("Digite a quantia a ser depositada: ");
		Scanner sc = new Scanner(System.in);
		double valor = 0;
		boolean hasnextDouble = false;
		if (hasnextDouble)
			valor = sc.nextDouble();
		
			
		sc.close();
		
		return valor;
		
		
	
	}
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double valor2 = Deposito.valores();
		
		if ( valor2 > 0) {
			Main main2 = new Main();
			main2.saldo += valor2;
			System.out.println();
			Extrato.extratos.add("Valor do depósito: " + valor2);
			System.out.println(Extrato.extratos);
			
		} else {
			System.out.println("\nErro! Imposssível adicionar valor negativo!");
		}
		System.out.println("\nObrigado por utilizar meu sistema!");
		
		Main.main(null);
		
		sc.close();
		
		
	}
}
