package com.ProjetBasket.Basketball.joueurs;

public class Joueurs {
	
	private int id; 
	private String nom;
	private String position;
	private int No;
	private int equipe;
	private double taille; 
	private int poid; 
	
	public Joueurs() {
		
	}
	public int getId() {
		return id;
	}
    public void setId(int id) {
		this.id = id;
	}


	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	
	public String getPosition() {
		return position;
	}


	public void setPosition(String position) {
		this.position = position;
	}
	
	
	public int getNo() {
		return No;
	}
    public void setNo(int No) {
		this.No = No;
	}

    
    
    public int getEquipe() {
		return equipe;
	}
    public void setEquipe(int equipe) {
		this.equipe = equipe;
	}
    
    
    public double getTaille() {
		return equipe;
	}
    public void setTaille(double taille) {
		this.taille = taille;
	}
    
    
    public int getPoid() {
		return poid;
	}
    public void setPoid(int poid) {
		this.poid = poid;
	}
 
    
    @Override
	public String toString() {
		return id+ " " + nom + " position " + "No" + " equipe" +"taille" + "poid";
	}
}
