package com.gft.testes.teste4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite sua idade:");
		int idade = sc.nextInt();
		
		if(idade > 18 && idade < 67) {
			
			System.out.println("\nParabéns! Você pode ser um doador de sangue.");
		}else {
			
			System.out.println("\nInfelizmente você não pode ser um doador de sangue.");
		}
		
		sc.close();

	}

}
