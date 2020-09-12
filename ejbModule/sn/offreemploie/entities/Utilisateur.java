package sn.offreemploie.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity
public class Utilisateur {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(length=200)
	private String nom;
	@Column(length=200)
	private String prenom;
	@Column(length=200)
	private String email;
	@Column(length=200)
	private String password;
	@Column(length=200)
	private String photo;
	@ManyToOne
	private Profil profil;
	public Utilisateur() {
		super();
	}
	public Utilisateur(int id, String nom, String prenom, String email, String password,String photo, Profil profil) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.password = password;
		this.photo = photo;
		this.profil = profil;
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
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Profil getProfil() {
		return profil;
	}
	public void setProfil(Profil profil) {
		this.profil = profil;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	
	
	

}
