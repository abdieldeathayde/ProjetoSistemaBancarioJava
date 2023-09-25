package com.projeto.banco;

import java.util.Scanner;

public class Deposito {

	public static void main(String[] args) {

		System.out.println("Digite a quantia a ser depositada: ");
		Scanner sc = new Scanner(System.in);
		double valor = sc.nextDouble();
		if (valor > 0) {
			Main main2 = new Main();
			main2.saldo += valor;
			//main2.extratos={"Deposito realizado: "+saldo};
			//System.out.println(extratos);
			
			
			System.out.println("\nValor depositado: " + valor);
		} else {
			System.out.println("\nErro! Imposssível adicionar valor negativo!");
		}
		System.out.println("\nObrigado por utilizar meu sistema!");
		
		Main.main(args);
		
		sc.close();
	}
}
