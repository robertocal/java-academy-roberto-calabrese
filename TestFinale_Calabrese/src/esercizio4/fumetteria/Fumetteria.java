package esercizio4.fumetteria;

import java.util.*;

public class Fumetteria {
	private String nome, via, titolare;
	private Integer numeroDiFumettiMassimi;
	private List<Fumetto> fumetti;
	
	public Fumetteria(String nome, String via, String titolare, Integer numeroDiFumettiMassimi, List<Fumetto> fumetti) {
		this.nome = nome;
		this.via = via;
		this.titolare = titolare;
		this.numeroDiFumettiMassimi = numeroDiFumettiMassimi;
		this.fumetti = fumetti;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getVia() {
		return via;
	}

	public void setVia(String via) {
		this.via = via;
	}

	public String getTitolare() {
		return titolare;
	}

	public void setTitolare(String titolare) {
		this.titolare = titolare;
	}

	public Integer getNumeroDiFumettiMassimi() {
		return numeroDiFumettiMassimi;
	}

	public void setNumeroDiFumettiMassimi(Integer numeroDiFumettiMassimi) {
		this.numeroDiFumettiMassimi = numeroDiFumettiMassimi;
	}

	public List<Fumetto> getFumetti() {
		return fumetti;
	}

	public void setFumetti(List<Fumetto> fumetti) {
		this.fumetti = fumetti;
	}
	
	public void stampaDati() {
		System.out.println(this.toString());
	}

	@Override
	public String toString() {
		return "Fumetteria [nome=" + nome + ", via=" + via + ", titolare=" + titolare + ", numeroDiFumettiMassimi="
				+ numeroDiFumettiMassimi + ", fumetti=" + fumetti + "]";
	}
	
}
