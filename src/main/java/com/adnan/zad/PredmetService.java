package com.adnan.zad;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PredmetService {
	
	@Autowired
	private PredmetRepository rep;
	
	public List<Predmet>listAll(){
		return rep.findAll();
	}
	
	public void save(Predmet p){
		 rep.save(p);
	}

	public Predmet getById(int i){
		return rep.findById(i).get();
	}
	public void delete(int i){
		rep.deleteById(i);
	}
}
