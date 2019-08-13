package model.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;

import model.domain.LancamentoJogo;

public class LancamentoJogoDao {
	private EntityManager em;
	private Session session;
	
	public LancamentoJogoDao() {
		em = Conexao.getConexao();
		session = em.unwrap(Session.class);
	}
	
	public LancamentoJogo salvar(LancamentoJogo lancamentoJogo) throws Exception {
		try {
			em.getTransaction().begin();
			lancamentoJogo = em.merge(lancamentoJogo);
			em.getTransaction().commit();
			return lancamentoJogo;
		}catch(Exception e) {
			em.getTransaction().rollback();
			throw e;
		}		
	}
	
	public List<LancamentoJogo> buscarTodos(){
		return session.createCriteria(LancamentoJogo.class).list();
	}
}
