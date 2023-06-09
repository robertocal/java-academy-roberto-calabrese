package esercizio3;

import esercizio3.implementazione.Calciatore;

public class MainTest {

	public static void main(String[] args) {
		Calciatore c = new Calciatore("Mario", "Rossi", "Salerno", "Salernitana", "attaccante", 1995, 1000000, 5, 100500.0);

		c.stampaDati();
		
		System.out.println("Stipendio mensile: " + c.calcolaStipendioMensile());
		
	}

}
