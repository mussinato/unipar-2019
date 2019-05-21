package dao;

import javax.persistence.EntityManager;

import dominio.Cidade;

public class CidadeDAO {
	
	public Cidade salvar(Cidade cidade) throws Exception {
		EntityManager em = Conexao.getConexao();
		em.getTransaction().begin();
		try {
			cidade = em.merge(cidade); // insert ou update
			em.getTransaction().commit();
			return cidade;
		} catch (Exception ex) {
			em.getTransaction().rollback();
			throw new Exception("Erro ao salvar a cidade: "+ex.getMessage());
		}				
	}
	
	public void excluir(Cidade cidade) throws Exception {
		EntityManager em = Conexao.getConexao();
		em.getTransaction().begin();
		try {
			em.remove(cidade);
			em.getTransaction().commit();
		}catch(Exception ex) {
			em.getTransaction().rollback();
			throw new Exception("Erro ao excluir a cidade: "+
						ex.getMessage());
		}
	}
}

















