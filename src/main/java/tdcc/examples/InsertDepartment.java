package tdcc.examples;

import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
import tdcc.company.Department;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import tdcc.company.Employee;

import java.util.Date;

public class InsertDepartment {
    public static void main(String[] args) {
        EntityManagerFactory emf =
                Persistence.createEntityManagerFactory("default");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Department d = new Department();
        d.setId(9);
        d.setName("XYZ1");
        //v2:
        Employee john = getEmployee(em, "111111100");
        //v1: d.setManagerSsn("12121213");
        d.setManager(john);
        d.setManagerStartDate(new Date());
        em.persist(d);
        em.getTransaction().commit();
        em.close();
        emf.close();
    }

    private static Employee getEmployee(EntityManager em, String ssn) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Employee> criteria = cb.createQuery(Employee.class);
        Root<Employee> i = criteria.from(Employee.class);
        criteria.select(i).where(cb.equal(i.get("ssn"), ssn));
        TypedQuery<Employee> query = em.createQuery(criteria);
        return query.getSingleResult();
    }
}
