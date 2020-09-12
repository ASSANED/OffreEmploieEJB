package sn.offreemploie.dao;

import java.util.List;

import javax.ejb.Local;

import sn.offreemploie.entities.Curricirum;


@Local
public interface ICurricirum {
	public int add(Curricirum curricirum);
	public int update(Curricirum curricirum);
	public int delete(int id);
	public List<Curricirum> getAll();
	public Curricirum get(int id);

}
