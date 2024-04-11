package poo.prova.main;

import java.time.LocalTime;

import poo.prova.models.Banda;
import poo.prova.models.Cantor;
import poo.prova.models.Dj;
import poo.prova.models.Palco;
import poo.prova.util.Genero;

public class Festival {
	
	public static void main(String[] args) {
		
		Palco palco1 = new Palco("Principal", 10000);
		Palco palco2 = new Palco("Secundario", 5000);
		
		Cantor cantor1 = new Cantor("Jorgin da gaita", Genero.ROCK, 1500, false);
		Cantor cantor2 = new Cantor("Amaral da cabeça de gelo", Genero.PAGODE, 25, true);
		Cantor cantor3 = new Cantor("Chico Moedas", Genero.FUNK, 1500, false);
		Cantor cantor4 = new Cantor("Ari Toledo", Genero.PIADAS, 1500, true);
		Banda banda1 = new Banda("Engenheiros do açai", Genero.POP, 2.5, 13);
		Banda banda2 = new Banda("Os Calabresos", Genero.ROCK, 14000, 2);
		Banda banda3 = new Banda("Roupa Velha", Genero.PAGODE, 1100, 20);
		Banda banda4 = new Banda("Zumbi do Jantares", Genero.ELETRONICA, 12000, 4);
		Dj dj1 = new Dj("DJ ALOKA", Genero.ROCK, 25000);
		Dj dj2 = new Dj("DJ AZEITONA", Genero.ELETRONICA, 12000);
		Dj dj3 = new Dj("DJ CLEITON RASTA", Genero.PAGODE, 30000);
		Dj dj4 = new Dj("DJ QUERIDÃO", Genero.ROCK, 40000000);
		
		palco1.reservarHorario("10/04/2024", LocalTime.of(17,0), cantor1);
		palco1.reservarHorario("10/04/2024", LocalTime.of(18,0), cantor2);
		palco1.reservarHorario("10/04/2024", LocalTime.of(19,0), banda1);
		palco1.reservarHorario("11/04/2024", LocalTime.of(21,0), banda2);
		palco1.reservarHorario("11/04/2024", LocalTime.of(22,0), dj1);
		palco1.reservarHorario("11/04/2024", LocalTime.of(23,0), dj2);
		palco2.reservarHorario("10/04/2024", LocalTime.of(17,0), cantor3);
		palco2.reservarHorario("10/04/2024", LocalTime.of(18,0), cantor4);
		palco2.reservarHorario("10/04/2024", LocalTime.of(19,0), banda3);
		palco2.reservarHorario("11/04/2024", LocalTime.of(20,0), banda4);
		palco2.reservarHorario("11/04/2024", LocalTime.of(21,0), dj3);
		palco2.reservarHorario("11/04/2024", LocalTime.of(23,0), dj4);
		

		palco1.exibeShows();
		palco2.exibeShows();
	}
}
