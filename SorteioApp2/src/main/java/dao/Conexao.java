package dao;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class Conexao {
	
	private static EntityManager em = null;
	
	static {
		em = Persistence.createEntityManagerFactory("AulaPU")
				.createEntityManager();		
	}
	
	public static EntityManager getConexao() {
		return em;
	}
}