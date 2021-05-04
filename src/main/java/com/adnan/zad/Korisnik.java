package com.adnan.zad;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Korisnik")
public class Korisnik {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int korisnikID;
	

	@Column(name="ime")
	private String korisnickoIme;
	
	
	
	private String lozinka, uloga;
	public int getKorisnikID() {
		return korisnikID;
	}
	public Korisnik() {
		super();
	}
	public Korisnik(int korisnikID, String korisnickoIme, String lozinka, String uloga) {
		super();
		this.korisnikID = korisnikID;
		this.korisnickoIme = korisnickoIme;
		this.lozinka = lozinka;
		this.uloga = uloga;
	}
	public String getUloga() {
		return uloga;
	}
	public void setUloga(String uloga) {
		this.uloga = uloga;
	}
	public void setKorisnikID(int korisnikID) {
		this.korisnikID = korisnikID;
	}
	public String getKorisnickoIme() {
		return korisnickoIme;
	}
	public void setKorisnickoIme(String korisnickoIme) {
		this.korisnickoIme = korisnickoIme;
	}
	public String getLozinka() {
		return lozinka;
	}
	public void setLozinka(String lozinka) {
		this.lozinka = lozinka;
	}
	
}
