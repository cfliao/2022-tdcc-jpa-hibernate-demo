package tdcc.examples;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;
import tdcc.company.Department;

public class DeleteDepartment {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Department d = getDepartment(em, 9);
        em.remove(d);
        em.getTransaction().commit();
        em.close();
        emf.close();
    }

    private static Department getDepartment(EntityManager em, int id) {
        TypedQuery<Department> query =
                em.createQuery("SELECT d FROM Department d WHERE d.id = :id", Department.class)
                        .setParameter("id", id);
        return query.getSingleResult();
    }
}
