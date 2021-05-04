package com.adnan.zad;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.GenerationType;

@Entity
public class Predmet {
	private int predmetID;
	public Predmet() {
		
	}
	
	private String naziv, odsjek, nastavnik,opis;
	
	public String getOpis() {
		return opis;
	}
	public void setOpis(String opis) {
		this.opis = opis;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getPredmetID() {
		return predmetID;
	}
	public Predmet(int predmetID, String naziv, String odsjek, String nastavnik, String opis) {
		super();
		this.predmetID = predmetID;
		this.naziv = naziv;
		this.odsjek = odsjek;
		this.nastavnik = nastavnik;
		this.opis = opis;
	}
	public void setPredmetID(int predmetID) {
		this.predmetID = predmetID;
	}
	
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public String getOdsjek() {
		return odsjek;
	}
	public void setOdsjek(String odsjek) {
		this.odsjek = odsjek;
	}
	public String getNastavnik() {
		return nastavnik;
	}
	public void setNastavnik(String nastavnik) {
		this.nastavnik = nastavnik;
	}


}
