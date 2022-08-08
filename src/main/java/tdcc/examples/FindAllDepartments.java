package tdcc.examples;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import tdcc.company.Department;

import java.util.List;

public class FindAllDepartments {
    public static void main(String[] args){
        EntityManagerFactory emf =
                Persistence.createEntityManagerFactory("default");
        EntityManager em = emf.createEntityManager();

        List<Department> departments = em.createQuery("select d from Department d").getResultList();

        for(Department d: departments){
            System.out.println(d);
        }

        em.close();
        emf.close();
    }
}
