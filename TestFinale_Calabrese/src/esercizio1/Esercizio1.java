package esercizio1;

public class Esercizio1 {

	public static void main(String[] args) {
		int[] arr = {547, 87, 1, 24, 4, 9, 54, 37, 26, 19};
		int somma = 0, media;
		
		for(int i=0; i<arr.length; i++) {
			somma += arr[i];
		}
		
		media = somma / arr.length;
		
		System.out.println("La media è: " + media);

	}

}
