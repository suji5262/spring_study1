package hellojpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaMain {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");

        EntityManager em = emf.createEntityManager();

        // 여기에 실제 코드를 작성하면 됨


        em.close();
        emf.close(); // 실제 emf 가 다 끝나면 닫아줘야함
    }
}
