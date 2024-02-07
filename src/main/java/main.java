import entity.StudentEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class main {
    public static void main(String[] args) {
        EntityManagerFactory e = Persistence.createEntityManagerFactory("reg");
        EntityManager EntityManager = e.createEntityManager();
        EntityTransaction EntityTransaction = EntityManager.getTransaction();
        try {
            EntityTransaction.begin();
            StudentEntity khaled = new StudentEntity(16
                    , "khaled", 10);
            EntityManager.persist(khaled);
            EntityTransaction.commit();
        } catch (Exception error) {
            error.printStackTrace();
        }


    }
}
