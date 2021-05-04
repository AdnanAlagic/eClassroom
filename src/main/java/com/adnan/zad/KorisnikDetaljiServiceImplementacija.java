package com.adnan.zad;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class KorisnikDetaljiServiceImplementacija implements UserDetailsService {

	@Autowired
	private KorisnikRepository korisnikRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Korisnik korisnik = korisnikRepository.getKorisnikByKorisnickoIme(username);
		
		if(korisnik == null)
			throw new UsernameNotFoundException("Korisnik nije pronadjen..");
		
		return new MojKorisnikDetalji(korisnik);
	}

}
