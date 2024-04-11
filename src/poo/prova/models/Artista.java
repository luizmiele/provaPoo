package poo.prova.models;

import poo.prova.util.Genero;

public abstract class Artista {
	private String nome;
	private Genero generoMusical ;
	private double valorCache;
	
	public Artista(String nome, Genero generoMusical, double valorCaache) {
		this.nome = nome;
		this.generoMusical = generoMusical;
		this.valorCache = valorCaache;
	}

	public String getNome() {
		return nome;
	}

	public Genero getGeneroMusical() {
		return generoMusical;
	}

	public double getValorCache() {
		return valorCache;
	}

	@Override
	public String toString() {
		return "Nome: " + nome + "\nGenero Musical: " + generoMusical;
	}
	
	
	
}
