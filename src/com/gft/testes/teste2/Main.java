package com.gft.testes.teste2;

import com.gft.testes.teste2.models.ContaCorrente;
import com.gft.testes.teste2.models.ContaPoupanca;

public class Main {

	public static void main(String[] args) {

		ContaCorrente cc = new ContaCorrente(001, "Tiago");
		ContaPoupanca cp = new ContaPoupanca(002, "Maria");
		
		cc.desositar(1000);
		cp.desositar(2000);
		
		System.out.println(cc);
		System.out.println("Rendimento da Conta Corrente - "+ cc.rendimento());
		
		System.out.println();
		
		System.out.println(cp);
		System.out.println("Rendimento da Conta Poupança - "+ cp.rendimento());
		
		
	}

}
