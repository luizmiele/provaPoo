package poo.prova.models;

import poo.prova.util.Genero;

public class Cantor extends Artista{
	private boolean precisaBanda;
	
	public Cantor(String nome, Genero generoMusical, double valorCaache, boolean precisaBanda) {
		super(nome, generoMusical, valorCaache);
		this.precisaBanda = precisaBanda;
	}

	public boolean isPrecisaBanda() {
		return precisaBanda;
	}

	@Override
	public String toString() {
		return super.toString();
	}

	
	
}
