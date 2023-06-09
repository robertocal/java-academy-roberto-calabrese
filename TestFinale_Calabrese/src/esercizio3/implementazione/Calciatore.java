package esercizio3.implementazione;

import esercizio3.interfaccia.GiocatoreProfessionista;

public class Calciatore implements GiocatoreProfessionista {
	
	private String nome, cognome, luogoDiNascita, squadra, ruolo;
	private Integer annoDiNascita, costoCartellino, anniDiContratto;
	private Double stipendioAnnuo;
	
	public Calciatore(String nome, String cognome, String luogoDiNascita, String squadra, String ruolo,
			Integer annoDiNascita, Integer costoCartellino, Integer anniDiContratto, Double stipendioAnnuo) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.luogoDiNascita = luogoDiNascita;
		this.squadra = squadra;
		this.ruolo = ruolo;
		this.annoDiNascita = annoDiNascita;
		this.costoCartellino = costoCartellino;
		this.anniDiContratto = anniDiContratto;
		this.stipendioAnnuo = stipendioAnnuo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getLuogoDiNascita() {
		return luogoDiNascita;
	}

	public void setLuogoDiNascita(String luogoDiNascita) {
		this.luogoDiNascita = luogoDiNascita;
	}

	public String getSquadra() {
		return squadra;
	}

	public void setSquadra(String squadra) {
		this.squadra = squadra;
	}

	public String getRuolo() {
		return ruolo;
	}

	public void setRuolo(String ruolo) {
		this.ruolo = ruolo;
	}

	public Integer getAnnoDiNascita() {
		return annoDiNascita;
	}

	public void setAnnoDiNascita(Integer annoDiNascita) {
		this.annoDiNascita = annoDiNascita;
	}

	public Integer getCostoCartellino() {
		return costoCartellino;
	}

	public void setCostoCartellino(Integer costoCartellino) {
		this.costoCartellino = costoCartellino;
	}

	public Integer getAnniDiContratto() {
		return anniDiContratto;
	}

	public void setAnniDiContratto(Integer anniDiContratto) {
		this.anniDiContratto = anniDiContratto;
	}

	public Double getStipendioAnnuo() {
		return stipendioAnnuo;
	}

	public void setStipendioAnnuo(Double stipendioAnnuo) {
		this.stipendioAnnuo = stipendioAnnuo;
	}

	@Override
	public void stampaDati() {
		System.out.println(this.toString());
	}

	@Override
	public Double calcolaStipendioMensile() {
		return this.stipendioAnnuo / 12;
	}

	@Override
	public String toString() {
		return "Calciatore [nome=" + nome + ", cognome=" + cognome + ", luogoDiNascita=" + luogoDiNascita + ", squadra="
				+ squadra + ", ruolo=" + ruolo + ", annoDiNascita=" + annoDiNascita + ", costoCartellino="
				+ costoCartellino + ", anniDiContratto=" + anniDiContratto + ", stipendioAnnuo=" + stipendioAnnuo + "]";
	}
	
}
