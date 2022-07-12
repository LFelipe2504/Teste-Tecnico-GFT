package com.gft.testes.teste2.models;

public abstract class Conta {
	
	protected int numero;
	protected String titular;
	protected double saldo;


	public Conta(int numero, String titular) {
		super();
		this.numero = numero;
		this.titular = titular;
		
	}
	
	
	public double rendimento() {		
		return 0;
	}

	public int getNumero() {
		return numero;
	}	

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void desositar(double saldo) {
		this.saldo += saldo;
	}

	@Override
	public String toString() {
		return "Conta [numero=" + numero + ", titular=" + titular + ", saldo=" + saldo + "]";
	}
	
	
	
	

}
