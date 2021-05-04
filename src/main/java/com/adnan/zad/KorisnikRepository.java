package com.adnan.zad;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface KorisnikRepository extends CrudRepository<Korisnik, Integer> {
	
	@Query("select k from Korisnik k where k.korisnickoIme = :korisnickoIme")
	public Korisnik getKorisnikByKorisnickoIme(@Param("korisnickoIme") String korisnickoIme);
}
