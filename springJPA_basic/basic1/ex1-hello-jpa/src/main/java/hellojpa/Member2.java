package hellojpa;//package hellojpa;
//
//import javax.persistence.*;
//
//@Entity
//public class Member2 {
//
//    @Id
//    @GeneratedValue
//    @Column(name = "MEMBER_ID")
//    private Long id;
//
//    @Column(name = "USERNAME")
//    private String username;
//
////    @Column(name = "TEAM_ID")
////    private Long teamId;
//
//    @ManyToOne
//    @JoinColumn(name = "TEAM_ID")
//    private Team team;
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getUsername() {
//        return username;
//    }
//
//    public void setUsername(String username) {
//        this.username = username;
//    }
//
//    public Team getTeam() {
//        return team;
//    }
//
//    public void setTeam(Team team) {
//        this.team = team;
//    }
//
////    public void changeTeam(Team team) { //  set 을 잘 안쓰고 이렇게 바꾸자!- 권장
////    this.team = team;
////    team.getMember2s().add(this); // 연관관계 편의 메서드
////    }
//}
