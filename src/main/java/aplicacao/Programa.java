package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Programa {

	public static void main(String[] args) {
		
//		Pessoa p1 = new Pessoa(null, "Carlos da Silva", "carlos@gmail.com");
//		Pessoa p2 = new Pessoa(null, "Joaquim Torres", "joaquim@gmail.com");
//		Pessoa p3 = new Pessoa(null, "Ana Maria", "ana@gmail.com");
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
//		em.getTransaction().begin();
//		em.persist(p1);
//		em.persist(p2);
//		em.persist(p3);
//		em.getTransaction().commit();
		
/*		Pessoa px1 = em.find(Pessoa.class, 1);
		Pessoa px2 = em.find(Pessoa.class, 2);
		Pessoa px3 = em.find(Pessoa.class, 3);
		System.out.println(px1);
		System.out.println(px2);
		System.out.println(px3); */

		//Pessoa p = em.find(Pessoa.class, 3);
		//System.out.println(p);
		
		System.out.println("Consulta de Registro");
		Pessoa p = em.find(Pessoa.class, 5);
		System.out.println(p);
				
		//em.getTransaction().begin();
		//em.remove(p);
		//em.getTransaction().commit();
				
		em.close();
		emf.close();
		
	}

}
