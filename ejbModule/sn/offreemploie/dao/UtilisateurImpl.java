package sn.offreemploie.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import sn.offreemploie.entities.Utilisateur;



@Stateless
public class UtilisateurImpl implements IUtilisateur {
	
	@PersistenceContext(unitName="offreemploi_UP")
	private EntityManager em;
		@Override
		public Utilisateur getLogin(String email, String password) {
			
			try {
				return(Utilisateur)em.createQuery
						("SELECT u FROM Utilisateur u WHERE u.email=:em AND u.password=:pwd")
						.setParameter("em",email)
						.setParameter("pwd",password).getSingleResult();
			}catch (Exception e) {
				e.printStackTrace();
			}
			
			return null;
		}

	@Override
	public int add(Utilisateur user) {
		try {
			em.persist(user);
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public int update(Utilisateur user) {
		try {
			em.merge(user);
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public int delete(int id) {
		try {
			em.remove(em.find(Utilisateur.class, id));
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Utilisateur> getAll() {
		try {
			return em.createQuery("SELECT u FROM Utilisateur u").getResultList();
			
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public Utilisateur get(int id) {
		return em.find(Utilisateur.class, id);
	}

	
	

}
