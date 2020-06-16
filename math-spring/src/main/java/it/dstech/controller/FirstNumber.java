package it.dstech.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import it.dstech.service.Service;

@Controller
public class FirstNumber {
	@RequestMapping(value = "/numeriScelti")
	public ModelAndView stiCazzi(@RequestParam("primoNumero") double x, @RequestParam("secondoNumero") double y,
			Model model) {
		ModelAndView modello = new ModelAndView();
		modello.setViewName("sceltaOperazione");
		modello.addObject("primoNumero", x);
		modello.addObject("secondoNumero", y);
		return modello;

	}

	@RequestMapping(value = "/sceltaOperazione")
	public ModelAndView stoCazzo(@RequestParam("operazione") String name, @RequestParam("primoNumero") double x,
			@RequestParam("secondoNumero") double y, Model model) {
		ModelAndView modello2 = new ModelAndView();
		modello2.setViewName("risultato");
		modello2.addObject("primoNumero", x);
		modello2.addObject("secondoNumero", y);
		modello2.addObject("operazione",name);
		Service service = new Service(x, y, name);
		double risultato;
		if (name.equals("addizione")) {

			risultato = service.addizione();

		} else if (name.equals("sottrazione")) {
			risultato = service.sottrazione();
		} else if (name.equals("moltiplicazione")) {
			risultato = service.moltiplicazione();
		} else {
			risultato = service.divisione();

		}
		modello2.addObject("risultato",risultato);
		
		return modello2;

	}

}
