package tdcc.examples;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import tdcc.animal.LandAnimal;

public class ListLandAnimals
{

    public static void main(String[] args)
    {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("animal");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        List<LandAnimal> landAnimals = entityManager.createQuery("SELECT la FROM LandAnimal la",LandAnimal.class).getResultList();
        
        for(LandAnimal l: landAnimals)
        {
            System.out.print(l.getName()+" ");
            System.out.println(l.getLegCount());
        }
        
        entityManager.close();
    }

}
