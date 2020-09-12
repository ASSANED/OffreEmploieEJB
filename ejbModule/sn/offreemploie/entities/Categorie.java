package sn.offreemploie.entities;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Categorie {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(length = 200)
	private String nom;
	@OneToMany(mappedBy = "categorie")
	private List<Offre> offres = new ArrayList<>();
	public Categorie() {
		super();
	}
	public Categorie(int id, String nom,List<Offre> offres) {
		super();
		this.id = id;
		this.nom = nom;
		this.offres = offres;
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
	public List<Offre> getOffres() {
		return offres;
	}
	public void setOffres(List<Offre> offres) {
		this.offres = offres;
	}
	
	

}
