package com.adnan.zad;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordGenerator {

	public static void main(String[] args) {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		String lozinka  = "hadzic";
		String sifriranaLozinka = encoder.encode(lozinka);
		
		
		System.out.println(sifriranaLozinka);

	}
}
