package com.gft.testes.teste1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int idade = 0, contador = 10;
		int soma1a10 = 0, soma11a20 = 0, soma21a30 = 0, soma31 = 0;
		double peso = 0, media1a10 = 0, media11a20 = 0, media21a30 = 0, media31 = 0;
		double peso1a10 = 0, peso11a20 = 0, peso21a30 = 0, peso31 = 0;
		
		for(int i = 1; i <= contador; i++) {
			
			System.out.println("Digite a idade da pessoa"+ i);
			idade = sc.nextInt();
			
			System.out.println("Digite o peso da pessoa"+ i);
			peso = sc.nextDouble();
			
			
			
			if(idade >= 1 && idade <= 10) {
				
				soma1a10++;
				peso1a10 += peso;
				
			}else if(idade >= 11 && idade <= 20) {
				
				soma11a20++;
				peso11a20 += peso;
				
			}else if(idade >= 21 && idade <= 30) {
				
				soma21a30++;
				peso21a30 += peso;
				
			}else if(idade >= 31) {
				
				soma31++;
				peso31 += peso;
				
			}
			
			
		}
		
		media1a10 = peso1a10/soma1a10;
		media11a20 =  peso11a20/soma11a20;
		media21a30 =  peso21a30/soma21a30;
		media31 =  peso31/soma31;		
		
		System.out.println( String.format("A média dos pesos das pessoas de 1 a 10 anos - %.2f ", media1a10)+"Kg");
		System.out.println( String.format("\nA média dos pesos das pessoas de 11 a 20 anos - %.2f", media11a20)+"Kg");
		System.out.println( String.format("\nA média dos pesos das pessoas de 21 a 30 anos - %.2f ", media21a30)+"Kg");
		System.out.println( String.format("\nA média dos pesos das pessoas maiores de 31 anos - %.2f ", media31)+"Kg");	
			
		sc.close();	

	}

}
