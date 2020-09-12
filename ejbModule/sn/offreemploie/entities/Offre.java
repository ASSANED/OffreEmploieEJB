package sn.offreemploie.entities;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
public class Offre implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(length = 200)
	private String localite;
	
	@Temporal(TemporalType.DATE)
	private Date datepublication;
	
	@Temporal(TemporalType.DATE)
	private Date dateExpiration;
	
	@ManyToOne
	private Categorie categorie;
	public Offre() {
		super();
	}
	public Offre(int id, String localite, Date datepublication, Date dateExpiration, Categorie categorie) {
		super();
		this.id = id;
		this.localite = localite;
		this.datepublication = datepublication;
		this.dateExpiration = dateExpiration;
		this.categorie = categorie;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLocalite() {
		return localite;
	}
	public void setLocalite(String localite) {
		this.localite = localite;
	}
	public Date getDatepublication() {
		return datepublication;
	}
	public void setDatepublication(Date datepublication) {
		this.datepublication = datepublication;
	}
	public Date getDateExpiration() {
		return dateExpiration;
	}
	public void setDateExpiration(Date dateExpiration) {
		this.dateExpiration = dateExpiration;
	}
	public Categorie getCategorie() {
		return categorie;
	}
	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}
	
	public String toString() {
		return new SimpleDateFormat("yyyy-MM-dd").format(dateExpiration);
		
	}
	
	public String toString2() {
		return new SimpleDateFormat("yyyy-MM-dd").format(datepublication);
		
	}

}
