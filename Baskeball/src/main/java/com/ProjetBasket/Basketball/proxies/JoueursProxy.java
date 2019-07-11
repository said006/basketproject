package com.ProjetBasket.Basketball.proxies;

	import java.util.List;


	import org.springframework.web.bind.annotation.GetMapping;

	import com.ProjetBasket.Basketball.joueurs.*;;


	public interface JoueursProxy {

		@GetMapping(value= "/joueurs")
		public List<Joueurs> listeDesProduits();

		public List<Joueurs> listeDesJoueurs();
		
		
	}
	

