package sn.offreemploie.dao;

import java.util.List;

import javax.ejb.Local;

import sn.offreemploie.entities.Utilisateur;

@Local
public interface IUtilisateur {
	public int add(Utilisateur user);
	public int update(Utilisateur user);
	public int delete(int id);
	public List<Utilisateur> getAll();
	public Utilisateur get(int id);

	public Utilisateur getLogin(String email,String password);


}
