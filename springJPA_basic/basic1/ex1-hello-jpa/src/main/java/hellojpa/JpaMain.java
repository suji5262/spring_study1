package hellojpa;//package hellojpa;
//
//import javax.persistence.EntityManager;
//import javax.persistence.EntityManagerFactory;
//import javax.persistence.EntityTransaction;
//import javax.persistence.Persistence;
//import java.util.List;
//
//public class JpaMain {
//    public static void main(String[] args) {
//        EntityManagerFactory emf =
//                Persistence.createEntityManagerFactory("hello");
//
//        EntityManager em = emf.createEntityManager();
//        EntityTransaction tx = em.getTransaction();
//        tx.begin();
//
//
//        // 여기에 실제 코드를 작성하면 됨
//        try {
////            Member member = new Member();
////            member.setId(2L);
////            member.setName("HelloB"); // 생성
////            em.persist(member);
//
//
////            Member findMember = em.find(Member.class, 1L);
////            System.out.println("findMember.id = " + findMember.getId());
////            System.out.println("findMember.name = " + findMember.getName()); // 조회
//
//
////            Member findMember = em.find(Member.class, 1L);
////            findMember.setName("HelloJPA"); // 수정
//
//
////            List<Member> result = em.createQuery("select m from Member as m", Member.class)
////                    .getResultList(); // member 객체를 대상으로 쿼리를
////
////            for (Member member : result) {
////                System.out.println("member.name = " + member.getName());
////            }
//
//
////            // 비영속 상태 -> 생성만 한 상태
////            Member member = new Member();
////            member.setId(101L);
////            member.setName("HelloJPA");
////
////            // 영속상태
////            System.out.println("=====BEFORE====");
////            em.persist(member); // 이때 쿼리가 나가지 않음(DB 저장 X)
////            System.out.println("=====AFTER====");
////
////            Member findMember = em.find(Member.class, 101L);
////
////            System.out.println("findMember.id = " + findMember.getId());
////            System.out.println("findMember.name = " + findMember.getName());
//            // 1차 캐시에 저장된 것을 조회
//
//
////            //영속
////            Member findMember1 = em.find(Member.class, 101L);
////            Member findMember2 = em.find(Member.class, 101L);
////            // 같은 걸 두번 조회하면 1차캐시에서 값을 가져온다
////
////            System.out.println("result = " + (findMember1 == findMember2));
//
//
////            Member member1 = new Member(150L, "A");
////            Member member2 = new Member(160L, "B");
////
////            em.persist(member1);
////            em.persist(member2);
////
//// write           System.out.println("==================");
//
//
////            Member member = em.find(Member.class, 150L); // 조회
////            member.setName("zzzz"); // 변경
////
////            Member member2 = em.find(Member.class, 160L); // 조회
////            em.remove(member2); // 삭제
////
////            System.out.println("==================");
//
//
////            Member member = new Member(200L, "member200");
////            em.persist(member);
////
////            em.flush(); // 쿼리가 날라가는 걸 미리, 강제로 보고싶으면
////            System.out.println("==================");
//
//
////            Member member = em.find(Member.class, 150L);
////            member.setName("AAAA");
////
//////            em.detach(member); // 준영속 -> jpa 에서 관리 x
//////            // select 쿼리만 나가고 update 쿼리는 x
////
////            em.clear(); // 1차캐시를 통으로 날림
////
////            Member member2 = em.find(Member.class, 150L);
////
////            System.out.println("==================");
//
//
////            Member member = new Member();
//////            member.setId("ID_A");
////            member.setUsername("C");
////
////            System.out.println("=================");
////
////            em.persist(member);
////
////            System.out.println("member.id = " + member.getId());
////            System.out.println("=================");
//
////            Team team = new Team();
////            team.setName("TeamA");
////            em.persist(team);
////
////            Member2 member2 = new Member2();
////            member2.setUsername("member1");
//////            member2.changeTeam(team); // **
////            em.persist(member2);
////
////            team.addMember(member2);
////            team.getMember2s().add(member2); //**
//
////            em.flush();
////            em.clear();
//            // 위 두개 꼭 넣어야함! → 이걸 써야 db 에서 값을 깔끔하게 가져온다
//
////            Member2 findMember = em.find(Member2.class, member2.getId());
////            List<Member2> member2s = findMember.getTeam().getMember2s();
//
////            Team findTeam =em.find(Team.class, team.getId()); // 1차 캐시
////            List<Member2> member2s = findTeam.getMember2s();
////
////            System.out.println("==================");
////            for (Member2 m : member2s) {
////                System.out.println("m = " + m.getUsername());
////            }
////            System.out.println("==================");
//
//
//
////            Member2 findMember = em.find(Member2.class, member2.getId());
////            Team findTeam = findMember.getTeam();
////            System.out.println("findTeam = " + findTeam.getName());
//
//            tx.commit(); // 이때 쿼리가 나간다
//        } catch (Exception e) {
//            tx.rollback();
//        } finally {
//            em.close();
//        }
//
//
////        em.close();
//        emf.close(); // 실제 emf 가 다 끝나면 닫아줘야함
//    }
//
//    // 비즈니스 로직
////    private static void logic(EntityManager em) {}
//
//}
