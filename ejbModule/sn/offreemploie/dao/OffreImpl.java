package sn.offreemploie.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import sn.offreemploie.entities.Categorie;
import sn.offreemploie.entities.Offre;

@Stateless
public class OffreImpl implements IOffre {
	
	@PersistenceContext(unitName="offreemploi_UP")
	private EntityManager em;

	@Override
	public int add(Offre offre) {
		try {
			em.persist(offre);
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public int update(Offre offre) {
		try {
			em.merge(offre);
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public int delete(int id) {
		try {
			em.remove(em.find(Offre.class, id));
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Offre> getAll() {
		try {
			return em.createQuery("SELECT o FROM Offre o").getResultList();
			
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public Offre get(int id) {
		return em.find(Offre.class, id);
	}

}
