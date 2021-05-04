package com.adnan.zad;

import java.util.Arrays;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class MojKorisnikDetalji implements UserDetails {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Autowired
	private Korisnik korisnik;
	
	public MojKorisnikDetalji(Korisnik korisnik) {
		super();
		this.korisnik = korisnik;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		SimpleGrantedAuthority a = new SimpleGrantedAuthority(korisnik.getUloga());
		
		return Arrays.asList(a);
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return korisnik.getLozinka();
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return korisnik.getKorisnickoIme();
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

}
