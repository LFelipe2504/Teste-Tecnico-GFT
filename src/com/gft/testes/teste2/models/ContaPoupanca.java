package com.gft.testes.teste2.models;

public class ContaPoupanca extends Conta{

	public ContaPoupanca(int numero, String titular) {
		super(numero, titular);
	}
	
	@Override
	public double rendimento() {
		return super.saldo * 0.05;
	}
	

}
