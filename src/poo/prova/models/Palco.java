package poo.prova.models;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Palco {
	private String nomePalco;
	private int capacidade;
	private List<Horario> horarios = new ArrayList<>();
	
	public Palco(String nomePalco, int capacidade) {
		this.nomePalco = nomePalco;
		this.capacidade = capacidade;
	}

	public String getNomePalco() {
		return nomePalco;
	}

	public int getCapacidade() {
		return capacidade;
	}

	public List<Horario> getHorarios() {
		return horarios;
	}
	
	
	
	public void reservarHorario(String data, LocalTime hora, Artista artista) {
		Horario horario = new Horario(data, hora, artista);
		horarios.add(horario);
	}
	
	public void exibeShows() {
		System.out.println("                                       Os Shows do palco " + getNomePalco() + " são:\n");
		for (Horario horario : horarios) {
			System.out.println(horario);
		}
		System.out.println("\n");	
	}

	@Override
	public String toString() {
		return "NomePalco: " + nomePalco + "\nCapacidade: " + capacidade + "\nHorarios: " + horarios;
	}
	
	
	
}
