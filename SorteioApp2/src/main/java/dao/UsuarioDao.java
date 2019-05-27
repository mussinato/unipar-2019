package dao;

import javax.persistence.EntityManager;

import dominio.Usuario;

public class UsuarioDao {
	
	public Usuario salvar(Usuario usuario) throws Exception {
		EntityManager em = Conexao.getConexao();
		try {
			em.getTransaction().begin();
			usuario = em.merge(usuario);
			em.getTransaction().commit();
			return usuario;
		}catch(Exception e) {
			em.getTransaction().rollback();
			throw e;
		}		
	}
}
