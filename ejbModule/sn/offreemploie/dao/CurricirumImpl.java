package sn.offreemploie.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import sn.offreemploie.entities.Curricirum;


@Stateless
public class CurricirumImpl implements ICurricirum {
	
	@PersistenceContext(unitName="offreemploi_UP")
	private EntityManager em;

	@Override
	public int add(Curricirum curricirum) {
		try {
			em.persist(curricirum);
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public int update(Curricirum curricirum) {
		try {
			em.merge(curricirum);
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public int delete(int id) {
		try {
			em.remove(em.find(Curricirum.class, id));
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Curricirum> getAll() {
		try {
			return em.createQuery("SELECT c FROM Curricirum c").getResultList();
			
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public Curricirum get(int id) {
		return em.find(Curricirum.class, id);
	}


}
