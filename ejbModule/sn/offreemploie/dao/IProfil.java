package sn.offreemploie.dao;

import java.util.List;

import javax.ejb.Local;


import sn.offreemploie.entities.Profil;

@Local
public interface IProfil {
	public int add(Profil profil);
	public int update(Profil profil);
	public int delete(int id);
	public List<Profil> getAll();
	public Profil get(int id);

}
