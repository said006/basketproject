package com.ProjetBasket.Basketball.joueurs;

public class Equipes {

	private int id; 
	private String nom;
	private String localisations;
	private String division;
	private int creation;
	private String couleurs;
	private String img;
	
public Equipes() {
		
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
	

public String getlocalisations() {
	return localisations;
}


public void setlocalisations(String localisations) {
	this.localisations = localisations;
}



public String getdivision() {
	return division;
}


public void setdivision(String division) {
	this.division = division;
}


public int getcreation() {
	return creation;
}
public void setcreation(int creation) {
	this.creation = creation;
}


public String getcouleurs() {
	return couleurs;
}


public void setcouleurs(String couleurs) {
	this.couleurs = couleurs;
}

public String getImg() {
	return img;
}
public void setImg(String img) {
	this.img = img;
}

@Override
public String toString() {
	return id+ " " + nom + " localisations " + "division" + " creation" +"couleurs" + "img";
}

	
}
