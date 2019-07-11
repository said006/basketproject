package com.ProjetBasket.Basketball.DAO;

import java.util.ArrayList;
import java.util.List;

public interface EquipeDAO  {

	 List<EquipeDAO> Equips = new ArrayList<>();
		public JoueursDAO() {
		
			this.equipes.add(new Equipes (1,"Charlotte","Charlotte",  "Southeast", 1988 , "vert"));
		
			
		}
		public void addequipes(JequipesDAO J) {
			
			this.equipes.add(J);
		}
		
		public List<equipesDAO> getequipes() {
			return equipes;
		}
		
		
		public EquipesDAO getByID(int id) {
			for (EquipesDAO equipes : equipes) {
				if(equipes.getId() == id)
					return equipes;
			}
			return null;
		}
		
		
		private int getId() {
			
			return 0;
		}
		public void update(int id, equipesDAO j) {
			equipes jeu = getById(id);
			
			jeu.setId(j.getId());
			jeu.setlocalisations(j.getNom());
			jeu.setPosition(j.getlocalisations());
			jeu.setdivision(j.getdivision());
			jeu.setcreation(j.getcreation());
			jeu.setcouleurs(j.getcouleurs());
		
			
		}
		
	} 

}
