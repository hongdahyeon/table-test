package yongtable.tabletest.domain.UserRegion;

import yongtable.tabletest.domain.User.User;

import javax.persistence.*;

@Entity
@Table(name = "yong_user_region")
public class UserRegion {

    @Id @GeneratedValue
    @Column(name = "yong_user_region_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "yong_user_id")
    private User user;

    @Column(name = "latitude")  // 위도
    private float latitude;

    @Column(name = "langitude")  // 경도
    private float langitude;
}
