package it.polito.tdp.borders.model;

public class Evento implements Comparable<Evento>{
	
	private  int t;
	private int n;	//num persone che sono arrivate e si sposteranno
	private Country stato;	//paese in cui le persone arrivano e si sposteranno
	
	public Evento(int t, int n, Country stato) {
		super();
		this.t = t;
		this.n = n;
		this.stato = stato;
	}

	public int getT() {
		return t;
	}

	public int getN() {
		return n;
	}

	public Country getStato() {
		return stato;
	}

	@Override
	public int compareTo(Evento other) {
		return this.t-other.t;
	}
	
	
	

}
