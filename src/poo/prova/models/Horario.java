package poo.prova.models;

import java.time.LocalTime;

public class Horario {
    private String data;
    private LocalTime hora;
    private Artista artista;

    public Horario(String data, LocalTime hora, Artista artista) {
        this.data = data;
        this.hora = hora;
        this.artista = artista;
    }

    public String getData() {
        return data;
    }
    
    public LocalTime getHora() {
        return hora;
    }

    public Artista getArtista() {
        return artista;
    }

	@Override
	public String toString() {
		return artista + "\nData: " + getData() + "\nHora: " + hora + "\n" + "-----------------------------------------";
	}
    
    
}