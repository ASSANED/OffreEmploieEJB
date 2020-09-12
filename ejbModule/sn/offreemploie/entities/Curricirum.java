package sn.offreemploie.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Curricirum {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(length=200)
	private String nom;
	@Column(length=200)
	private String prenom;
	private int age;
	@Column(length=200)
	private String adresse;
	@Column(length=200)
	private String email;
	@Column(length=200)
	private String tel;
	@Column(length=200)
	private String specialite;
	@Column(length=200)
	private String niveauEtude;
	@Column(length=200)
	private String expProffessionel;
	public Curricirum() {
		super();
	}
	public Curricirum(int id, String nom, String prenom, int age, String adresse, String email, String tel,
			String specialite, String niveauEtude, String expProffessionel) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.adresse = adresse;
		this.email = email;
		this.tel = tel;
		this.specialite = specialite;
		this.niveauEtude = niveauEtude;
		this.expProffessionel = expProffessionel;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getSpecialite() {
		return specialite;
	}
	public void setSpecialite(String specialite) {
		this.specialite = specialite;
	}
	public String getNiveauEtude() {
		return niveauEtude;
	}
	public void setNiveauEtude(String niveauEtude) {
		this.niveauEtude = niveauEtude;
	}
	public String getExpProffessionel() {
		return expProffessionel;
	}
	public void setExpProffessionel(String expProffessionel) {
		this.expProffessionel = expProffessionel;
	}
	
	

}
