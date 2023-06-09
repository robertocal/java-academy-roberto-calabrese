package esercizio4.fumetteria;

public class Fumetto extends Libro {
	private String nome, disegnatore;

	public Fumetto(String titolo, String autore, String editore, Integer annoDiPubblicazione, Double costo, String nome, String disegnatore) {
		super(titolo, autore, editore, annoDiPubblicazione, costo);
		this.nome = nome;
		this.disegnatore = disegnatore;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDisegnatore() {
		return disegnatore;
	}

	public void setDisegnatore(String disegnatore) {
		this.disegnatore = disegnatore;
	}

	@Override
	public String toString() {
		return "Fumetto [nome=" + nome + ", disegnatore=" + disegnatore + ", toString()=" + super.toString() + "]";
	}

}
