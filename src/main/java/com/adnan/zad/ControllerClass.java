package com.adnan.zad;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class ControllerClass {

	@Autowired
	private PredmetService s;
	
	@RequestMapping("/")
	public String welcome() {
		return "index";
	}
	
	@RequestMapping("/pregledPredmeta")
	public String idiDalje(Model model) {
		List<Predmet> lista = s.listAll();
		model.addAttribute("lista",lista);
		
		return "pregled";
	}
	
	@RequestMapping("/azuriranjePredmeta")
	public String azuriranje(Model model) {
		List<Predmet> lista = s.listAll();
		model.addAttribute("lista",lista);
		
		return "azuriranje";
	}
	
	@RequestMapping("/dodaj")
	public String unosNovog(Model model){
		Predmet p = new Predmet();
		model.addAttribute("Predmet",p);
		return "dodaj";
	}
	
	@RequestMapping(value="/save", method=RequestMethod.POST)
	public String snimiPredmet(@ModelAttribute("Predmet") Predmet predmet){
		s.save(predmet);
		return "redirect:pregledPredmeta";
	}
	
	@RequestMapping("/detaljno/{id}")
	public ModelAndView detaljanPrikaz(@PathVariable(name = "id") int id) {
		ModelAndView m = new ModelAndView("detaljan_prikaz");
		Predmet p = s.getById(id);
		m.addObject("predmet",p);
		return m;
	}
	
	@RequestMapping("/uredi/{id}")
	public ModelAndView urediPredmet(@PathVariable(name = "id") int id) {
		ModelAndView mv  = new ModelAndView("uredi");
		Predmet p = s.getById(id);
		mv.addObject("predmet",p);
		s.delete(id);
		return mv;
	}
	
	@RequestMapping("/obrisi/{id}")
	public String brisanje(@PathVariable(name="id") int id) {
		s.delete(id);
		return "redirect:/";
	}
}
