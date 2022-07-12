package com.gft.testes.teste3.models;

public abstract class Automovel {
	
	protected String combustivel;
	
	

	public Automovel() {
	}	

	public String getCombustivel() {
		return combustivel;
	}	

	@Override
	public String toString() {
		return "Automovel [combustivel=" + combustivel + "]";
	}
	
	

}
