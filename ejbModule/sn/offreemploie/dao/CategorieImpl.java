package sn.offreemploie.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import sn.offreemploie.entities.Categorie;
@Stateless
public class CategorieImpl implements ICategorie {
	
	@PersistenceContext(unitName="offreemploi_UP")
	private EntityManager em;


	@Override
	public int add(Categorie categorie) {
		try {
			em.persist(categorie);
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public int update(Categorie categorie) {
		try {
			em.merge(categorie);
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public int delete(int id) {
		try {
			em.remove(em.find(Categorie.class, id));
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Categorie> getAll() {
		try {
			return em.createQuery("SELECT c FROM Categorie c").getResultList();
			
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public Categorie get(int id) {
		return em.find(Categorie.class, id);
	}

}
