package esercizio2;

import java.util.*;

public class Esercizio2 {

	public static void main(String[] args) {
		List<Integer> voti = new ArrayList<Integer>();
		Integer voto = 18, somma = 0, media;
		Scanner myObj = new Scanner(System.in);
		
		
		while (true) {
			try {
				System.out.println("Inserire un voto compreso tra 18 e 30: (inserire -1 per terminare l'inserimento dei voti)");
				voto = Integer.parseInt(myObj.nextLine());
				if (voto == -1) {
					break;
				}
				if (voto < 18 || voto > 30) {
					System.out.println("Valore inserito non corretto!");
					continue;
				}
				voti.add(voto);
			} catch (Exception e) {
				System.out.println("Input invalido. Riprova inserendo un numero intero!");
			}
		}
		
		for(int i=0; i<voti.size(); i++) {
			somma += voti.get(i);
		}
		
		media = somma / voti.size();
		
		System.out.println("La media dei voti è: " + media);
		
		

	}

}
