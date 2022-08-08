package tdcc.examples;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import tdcc.animal.AirAnimal;

public class ListAirAnimals
{

    public static void main(String[] args)
    {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("animal");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        List<AirAnimal> airAnimals = entityManager.createQuery("SELECT a FROM AirAnimal a", AirAnimal.class).getResultList();

        for (AirAnimal l : airAnimals)
        {
            System.out.print(l.getName() + " ");
            System.out.println(l.getWingSpan());
        }
        
        entityManager.close();
    }
}
