package sn.offreemploie.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
@Entity
public class Profil {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(length = 200)
	private String nom;
	@OneToMany(mappedBy = "profil")
	private List<Utilisateur> utilisateurs = new ArrayList<>();
	public Profil() {
		super();
	}
	public Profil(int id, String nom,List<Utilisateur> utilisateurs) {
		super();
		this.id = id;
		this.nom = nom;
		this.utilisateurs = utilisateurs;
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
	public List<Utilisateur> getUtilisateurs() {
		return utilisateurs;
	}
	public void setUtilisateurs(List<Utilisateur> utilisateurs) {
		this.utilisateurs = utilisateurs;
	}
	
	
	
	

}
