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

import com.sprhib.model.Aluno;
import com.sprhib.model.Universidade;
import com.sprhib.service.AlunoService;

@Controller
@RequestMapping(value="/aluno")
public class AlunoController {
	
	@Autowired
	private AlunoService alunoService;
	
	@RequestMapping(value="/add", method=RequestMethod.GET)
	public ModelAndView addAlunoPage() {
		ModelAndView modelAndView = new ModelAndView("add-aluno-form");
		modelAndView.addObject("aluno", new Aluno());
		List<Universidade> universidades = alunoService.getUniversidades();
		modelAndView.addObject("universidades", universidades);
		return modelAndView;
	}
	
	
	@RequestMapping(value="/add", method=RequestMethod.POST)
	public ModelAndView addingAluno(@Valid @ModelAttribute Aluno aluno) {
		
		ModelAndView modelAndView = new ModelAndView("home");
		alunoService.addAluno(aluno);
		
		String message = "Aluno was successfully added.";
		modelAndView.addObject("message", message);
		
		return modelAndView;
	}
	
	@RequestMapping(value="/list")
	public ModelAndView listOfAlunos() {
		ModelAndView modelAndView = new ModelAndView("list-of-alunos");
		
		List<Aluno> alunos = alunoService.getAlunos();
		modelAndView.addObject("alunos", alunos);
		List<Universidade> universidades = alunoService.getUniversidades();
		modelAndView.addObject("universidades", universidades);
		return modelAndView;
	}
	
	@RequestMapping(value="/edit/{cpf}", method=RequestMethod.GET)
	public ModelAndView editAlunoPage(@PathVariable Integer cpf) {
		ModelAndView modelAndView = new ModelAndView("edit-aluno-form");
		Aluno aluno = alunoService.getAluno(cpf);
		modelAndView.addObject("aluno",aluno);
		return modelAndView;
	}
	
	@RequestMapping(value="/edit/{cpf}", method=RequestMethod.POST)
	public ModelAndView edditingAluno(@ModelAttribute Aluno aluno, @PathVariable Integer cpf) {
		
		ModelAndView modelAndView = new ModelAndView("home");
		
		alunoService.updateAluno(aluno);
		
		String message = "Aluno was successfully edited.";
		modelAndView.addObject("message", message);
		
		return modelAndView;
	}
	
	@RequestMapping(value="/delete/{cpf}", method=RequestMethod.GET)
	public ModelAndView deleteAluno(@PathVariable Integer cpf) {
		ModelAndView modelAndView = new ModelAndView("home");
		alunoService.deleteAluno(cpf);
		String message = "Aluno was successfully deleted.";
		modelAndView.addObject("message", message);
		return modelAndView;
	}

}
