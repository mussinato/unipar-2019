package dao;

import javax.persistence.EntityManager;

import dominio.Veiculo;

public class VeiculoDAO {

	public Veiculo salvar(Veiculo veiculo) throws Exception {
		EntityManager em = Conexao.getConexao();
		em.getTransaction().begin();
		try {
			veiculo = em.merge(veiculo);
			em.getTransaction().commit();
			return veiculo;
		} catch (Exception ex) {
			em.getTransaction().rollback();
			throw new Exception("Erro ao salvar o veículo: "+
					ex.getMessage());
		}
	}
}
