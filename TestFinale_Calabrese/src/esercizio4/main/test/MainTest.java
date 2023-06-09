package esercizio4.main.test;

import esercizio4.fumetteria.Fumetto;
import esercizio4.fumetteria.Fumetteria;

import java.util.*;

public class MainTest {

	public static void main(String[] args) {
		Fumetto fumetto1 = new Fumetto("Superman", "Luca Rossi", "Mondadori", 1980, 110.0, "Marvel", "Andrea Rossi");
		Fumetto fumetto2 = new Fumetto("Batman", "Giancarlo Rossi", "Feltrinelli", 1990, 16.40, "Joker", "Antonio Rossi");
		
		List<Fumetto> lista = new ArrayList<Fumetto>();
		
		lista.add(fumetto1);
		lista.add(fumetto2);
		
		Fumetteria fumetteria = new Fumetteria("ComicsShop", "Via Dante Alighieri", "Mario Rossi", 5000, lista);
		
		fumetteria.stampaDati();

	}

}
