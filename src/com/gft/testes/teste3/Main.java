package com.gft.testes.teste3;

import com.gft.testes.teste3.models.Esportivo;

public class Main {

	public static void main(String[] args) {

		Esportivo esportivo = new Esportivo();
				
		
		String combustivelEsportivo =  esportivo.getCombustivel();
		
		
		System.out.println("O combustível do esportivo é "+combustivelEsportivo);
		
		
	}

}
