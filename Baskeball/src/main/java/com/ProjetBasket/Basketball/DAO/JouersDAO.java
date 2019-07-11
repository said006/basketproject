package com.ProjetBasket.Basketball.DAO;

@Repository
public interface JouersDAO extends JpaRepository<Joueurs, Integer>{
	




import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.ProjetBasket.Basketball.joueurs;
import com.ProjetBasket.Basketball.joueurs.Joueurs;

   List<JouersDAO> joueurs = new ArrayList<>();
	public JoueursDAO() {
	
		this.joueurs.add(new Joueurs (1,"Bacon","F", 7, 1, 2.01 , 100));
		this.joueurs.add(new Joueurs (2,"Batum","G/F", 5, 1, 2.03 , 91));
		this.joueurs.add(new Joueurs (3,"Carter","G", 10, 1, 1.98 , 186));
		
	}
	public void addjoueurs(JouersDAO J) {
		
		this.joueurs.add(J);
	}
	
	public List<JouersDAO> getJoueurs() {
		return joueurs;
	}
	
	
	public JoueursDAO getByID(int id) {
		for (JoueursDAO joueurs : joueurs) {
			if(joueurs.getId() == id)
				return joueurs;
		}
		return null;
	}
	
	
	private int getId() {
		
		return 0;
	}
	public void update(int id, JoueursDAO j) {
		Joueurs jeu = getById(id);
		
		jeu.setId(j.getId());
		jeu.setNom(j.getNom());
		jeu.setPosition(j.getposition());
		jeu.setNo(j.getNo());
		jeu.setEquipe(j.getequipe());
		jeu.setTaille(j.getTaille());
		jeu.setPoid(j.getPoid());
		
	}
	
} 
