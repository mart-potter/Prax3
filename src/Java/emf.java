package Java;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class emf
 */
public class emf extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
    /**
     * @see HttpServlet#HttpServlet()
     */
    public emf() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, 
			HttpServletResponse response) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-hsql-unit");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		Employee person = new Employee("Jack");
		em.persist(person);
		em.getTransaction().commit();
		em.close();
		emf.close();
	}
}
