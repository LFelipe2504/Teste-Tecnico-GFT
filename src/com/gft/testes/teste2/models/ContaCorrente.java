package com.gft.testes.teste2.models;

public class ContaCorrente extends Conta {

	public ContaCorrente(int numero, String titular) {
		super(numero, titular);
	}

	@Override
	public double rendimento() {
		// TODO Auto-generated method stub
		return super.saldo * 0.03;
	}
	
	

}
