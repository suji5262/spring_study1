package hellojpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JpaMain2 {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");

        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();


        try {

//            Member3 member3 = new Member3();
//            member3.setUsername("member1");
//
//            em.persist(member3); // 멤버 저장
//
//            Team2 team2 = new Team2();
//            team2.setName("teamA");
//
//            team2.getMember3s().add(member3); // 연관관계가 바껴야됨
//            // 쿼리가 한 번 더 나감
//
//            em.persist(team2);


            Movie movie = new Movie();
            movie.setDirector("a");
            movie.setActor("bbb");
            movie.setName("바람과 함께 사라지다");
            movie.setPrice(10000);

            em.persist(movie);

            em.flush();
            em.clear();

            Movie findMovie = em.find(Movie.class, movie.getId());
            System.out.println("findMovie = " + findMovie);


            tx.commit();
        } catch (Exception e) {
            tx.rollback();
        } finally {
            em.close();
        }


        emf.close();
    }
}

