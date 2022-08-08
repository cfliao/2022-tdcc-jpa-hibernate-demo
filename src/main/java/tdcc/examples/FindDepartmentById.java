package tdcc.examples;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;
import tdcc.company.Department;

public class FindDepartmentById {
    public static void main(String[] args) {
        EntityManagerFactory emf =
                Persistence.createEntityManagerFactory("default");
        EntityManager em = emf.createEntityManager();

        TypedQuery<Department> query =
                em.createQuery("SELECT d FROM Department d WHERE d.id = :id", Department.class)
                        .setParameter("id", 5);
        System.out.println(query.getSingleResult().getName());
        System.out.println(query.getSingleResult().getEmployees());

        em.close();
        emf.close();
    }
}
