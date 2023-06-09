package esercizio4.fumetteria;

public class Libro {
	private String titolo, autore, editore;
	private Integer annoDiPubblicazione;
	private Double costo;
	
	public Libro(String titolo, String autore, String editore, Integer annoDiPubblicazione, Double costo) {
		super();
		this.titolo = titolo;
		this.autore = autore;
		this.editore = editore;
		this.annoDiPubblicazione = annoDiPubblicazione;
		this.costo = costo;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public String getAutore() {
		return autore;
	}

	public void setAutore(String autore) {
		this.autore = autore;
	}

	public String getEditore() {
		return editore;
	}

	public void setEditore(String editore) {
		this.editore = editore;
	}

	public Integer getAnnoDiPubblicazione() {
		return annoDiPubblicazione;
	}

	public void setAnnoDiPubblicazione(Integer annoDiPubblicazione) {
		this.annoDiPubblicazione = annoDiPubblicazione;
	}

	public Double getCosto() {
		return costo;
	}

	public void setCosto(Double costo) {
		this.costo = costo;
	}

	@Override
	public String toString() {
		return "Libro [titolo=" + titolo + ", autore=" + autore + ", editore=" + editore + ", annoDiPubblicazione="
				+ annoDiPubblicazione + ", costo=" + costo + "]";
	}

}
