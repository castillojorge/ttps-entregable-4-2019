package ttps.tests.DAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

import ttps.hibernate.modelos.Due�o;
import ttps.hibernate.modelos.FichaPublica;
import ttps.hibernate.modelos.Usuario;

public class UsuarioDao {
	//@PersistenceContext(unitName = "miUP")
	//private static EntityManager manager;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("miUP");
				EntityManager manager = emf.createEntityManager();
				
				//Creo un mensaje y lo persisto
				Usuario u = new Usuario();
				u.setApellido_user("caskkl");
				u.setNombre_user("jorjkk");
				u.setEmail_user("aa@aa.com");
				u.setPassword("1223");
				u.setTelefono("123");
				manager.getTransaction().begin();
				manager.persist(u);
				manager.getTransaction().commit();
				

	}

}
