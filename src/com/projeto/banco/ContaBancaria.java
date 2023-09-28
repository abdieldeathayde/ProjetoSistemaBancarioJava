package com.projeto.banco;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ContaBancaria {

	public double depositar() {

		System.out.println("Digite a quantia a ser depositada: ");
		Scanner sc = new Scanner(System.in);
		double valor = 0;

		valor = sc.nextDouble();
		sc.nextLine();

		sc.close();

		return valor;

	}
	
	public void sacar() {
		Scanner sc = new Scanner(System.in);
		Main main2 = new Main();
		
		int saques = 0;
		double valor = depositar();
		
		System.out.println("Digite a quantia a ser sacada \n");
		
		valor = sc.nextDouble();
		sc.nextLine();
		
		if (valor < main2.limite && saques < main2.LIMITESAQUES) {
			main2.saldo -= valor;
			verExtrato().add("Valor do saque: " + valor);
			System.out.println(verExtrato());
			
			sc.close();
		} else {
			System.out.println("Erro! Saldo inválido!");
		}
		
		System.out.println("Obrigado por utilizar Meu sistema!");
//		Main.main(args);
		
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
