package dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

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
	
	public List<Usuario> buscarTodos(){
		EntityManager em = Conexao.getConexao();
		Session session = em.unwrap(Session.class);
		
		// select * from usuario
		return session.createCriteria(Usuario.class).list();
	}
	
	public Usuario buscarPorUsuario(String nomeUsuario) {
		EntityManager em = Conexao.getConexao();
		Session session = em.unwrap(Session.class);
		
		// select * from usuario where usuario = 'teste'
		return (Usuario) session.createCriteria(Usuario.class)
				.add(Restrictions.eq("usuario", nomeUsuario))
				.uniqueResult();
	}
	
	public Usuario login(String usuario, String senha) {
		EntityManager em = Conexao.getConexao();
		Session session = em.unwrap(Session.class);
		
		return (Usuario) session.createCriteria(Usuario.class)
				.add(Restrictions.eq("usuario", usuario))
				.add(Restrictions.eq("senha", senha))
				.uniqueResult();
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
