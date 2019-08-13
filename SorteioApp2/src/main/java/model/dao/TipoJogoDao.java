package model.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;

import model.domain.TipoJogo;

public class TipoJogoDao {
	private EntityManager em;
	private Session session;
	
	public TipoJogoDao() {
		em = Conexao.getConexao();
		session = em.unwrap(Session.class);
	}
	
	public TipoJogo salvar(TipoJogo tipoJogo) throws Exception {
		try {
			em.getTransaction().begin();
			tipoJogo = em.merge(tipoJogo);
			em.getTransaction().commit();
			return tipoJogo;
		}catch(Exception e) {
			em.getTransaction().rollback();
			throw e;
		}		
	}
	
	public List<TipoJogo> buscarTodos(){
		return session.createCriteria(TipoJogo.class).list();
	}
}
