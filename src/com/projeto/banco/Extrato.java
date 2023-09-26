package com.projeto.banco;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Extrato {

	static List<String> extratos = new ArrayList<String>();
	
	public static double exibirExtrato(double valor) {
		Scanner sc = new Scanner(System.in);

		for (double i = 0.0; i < extratos.size(); i++) {
			System.out.println(extratos.indexOf(i));
		}
		
		sc.close();
		return valor;
	}
	

}
