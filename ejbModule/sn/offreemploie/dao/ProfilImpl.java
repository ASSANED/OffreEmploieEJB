package sn.offreemploie.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


import sn.offreemploie.entities.Profil;

@Stateless
public class ProfilImpl implements IProfil {
	
	@PersistenceContext(unitName="offreemploi_UP")
	private EntityManager em;

	@Override
	public int add(Profil profil) {
		try {
			em.persist(profil);
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public int update(Profil profil) {
		try {
			em.merge(profil);
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public int delete(int id) {
		try {
			em.remove(em.find(Profil.class, id));
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Profil> getAll() {
		try {
			return em.createQuery("SELECT p FROM Profil p").getResultList();
			
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public Profil get(int id) {
		return em.find(Profil.class, id);
	}


}
