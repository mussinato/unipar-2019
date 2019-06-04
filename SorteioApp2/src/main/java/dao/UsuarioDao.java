package dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import dominio.Usuario;

public class UsuarioDao {
	
	private EntityManager em;
	private Session session;
	
	public UsuarioDao() {
		em = Conexao.getConexao();
		session = em.unwrap(Session.class);
	}
	
	public Usuario salvar(Usuario usuario) throws Exception {
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
		// select * from usuario
		return session.createCriteria(Usuario.class).list();
	}
	
	public Usuario buscarPorUsuario(String nomeUsuario) {
		// HQL = Hibernate Query Language
		// select * from usuario where usuario = 'teste'
		Query q = session
				.createQuery("from Usuario u "
						+ "where u.usuario = :user");
		q.setParameter("user", nomeUsuario);
		return (Usuario) q.uniqueResult();
	}
	
	public Usuario login(String usuario, String senha) {
		return (Usuario) session.createCriteria(Usuario.class)
				.add(Restrictions.eq("usuario", usuario))
				.add(Restrictions.eq("senha", senha))
				.uniqueResult();
	}
		
}
