package dao;

import javax.persistence.EntityManager;

import dominio.TipoJogo;

public class TipoJogoDao {
	public TipoJogo salvar(TipoJogo tipoJogo) throws Exception {
		EntityManager em = Conexao.getConexao();
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
}
