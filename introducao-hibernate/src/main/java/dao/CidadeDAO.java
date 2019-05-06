package dao;

import javax.persistence.EntityManager;

import dominio.Cidade;

public class CidadeDAO {
	
	public Cidade salvar(Cidade cidade) throws Exception {
		EntityManager em = Conexao.getConexao();
		em.getTransaction().begin();
		try {
			cidade = em.merge(cidade);
			em.getTransaction().commit();
			return cidade;
		} catch (Exception ex) {
			em.getTransaction().rollback();
			throw new Exception("Erro ao salvar a cidade: "+ex.getMessage());
		}				
	}
}
