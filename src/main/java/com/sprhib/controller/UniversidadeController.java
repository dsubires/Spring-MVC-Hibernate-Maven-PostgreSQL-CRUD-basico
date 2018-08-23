package com.sprhib.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.sprhib.model.Universidade;
import com.sprhib.service.UniversidadeService;

@Controller
@RequestMapping(value="/universidade")
public class UniversidadeController {
	
	@Autowired
	private UniversidadeService universidadeService;
	
	@RequestMapping(value="/add", method=RequestMethod.GET)
	public ModelAndView addUniversidadePage() {
		ModelAndView modelAndView = new ModelAndView("add-universidade-form");
		modelAndView.addObject("universidade", new Universidade());
		return modelAndView;
	}
	
	
	@RequestMapping(value="/add", method=RequestMethod.POST)
	public ModelAndView addingUniversidade(@Valid @ModelAttribute Universidade universidade) {
		
		ModelAndView modelAndView = new ModelAndView("home");
		universidadeService.addUniversidade(universidade);
		
		String message = "Universidade was successfully added.";
		modelAndView.addObject("message", message);
		
		return modelAndView;
	}
	
	@RequestMapping(value="/list")
	public ModelAndView listOfUniversidades() {
		ModelAndView modelAndView = new ModelAndView("list-of-universidades");
		
		List<Universidade> universidades = universidadeService.getUniversidades();
		modelAndView.addObject("universidades", universidades);
		
		return modelAndView;
	}
	
	@RequestMapping(value="/edit/{id}", method=RequestMethod.GET)
	public ModelAndView editUniversidadePage(@PathVariable Integer id) {
		ModelAndView modelAndView = new ModelAndView("edit-universidade-form");
		Universidade universidade = universidadeService.getUniversidade(id);
		modelAndView.addObject("universidade",universidade);
		return modelAndView;
	}
	
	@RequestMapping(value="/edit/{id}", method=RequestMethod.POST)
	public ModelAndView edditingUniversidade(@ModelAttribute Universidade universidade, @PathVariable Integer id) {
		
		ModelAndView modelAndView = new ModelAndView("home");
		
		universidadeService.updateUniversidade(universidade);
		
		String message = "Universidade was successfully edited.";
		modelAndView.addObject("message", message);
		
		return modelAndView;
	}
	
	@RequestMapping(value="/delete/{id}", method=RequestMethod.GET)
	public ModelAndView deleteUniversidade(@PathVariable Integer id) {
		ModelAndView modelAndView = new ModelAndView("home");
		universidadeService.deleteUniversidade(id);
		String message = "Universidade was successfully deleted.";
		modelAndView.addObject("message", message);
		return modelAndView;
	}

}
