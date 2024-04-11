package poo.prova.models;

import poo.prova.util.Genero;

public class Banda extends Artista{
	
	private int numeroIntegrantes;
	
	public Banda(String nome, Genero generoMusical, double valorCaache, int numeroIntegrantes) {
		super(nome, generoMusical, valorCaache);
		this.numeroIntegrantes = numeroIntegrantes;
	}

	public int getNumeroIntegrantes() {
		return numeroIntegrantes;
	}

	@Override
	public String toString() {
		return super.toString() + "Numero de Integrantes: " + numeroIntegrantes;
	}
	
	

}
