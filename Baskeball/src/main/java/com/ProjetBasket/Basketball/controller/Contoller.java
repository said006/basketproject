package com.ProjetBasket.Basketball.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.ProjetBasket.Basketball.joueurs.*;
import com.ProjetBasket.Basketball.proxies.JoueursProxy;;

public class Contoller {
	@Autowired
	private JoueursProxy joueursProxy;
	
	
	@GetMapping(value= "/accueil")
	public String pageAccueil(Model model) { 
		List<Joueurs> joueurs = joueursProxy.listeDesJoueurs(); 
		
		model.addAttribute("ps", joueurs); 
		return "Accueil"; 
	}
}
