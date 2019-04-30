import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import dominio.Cidade;

public class Principal {

	public static void main(String[] args) {
		EntityManager em = Persistence.createEntityManagerFactory("AulaPU")
			.createEntityManager();
		
		em.getTransaction().begin();
		
		Cidade cid = new Cidade();
		cid.setNomeCidade("CIANORTE");
		cid.setUf("PR");
		
		em.merge(cid); // <- salvar
		
		em.getTransaction().commit();
		
	}

}
