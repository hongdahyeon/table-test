package yongtable.tabletest.domain.user_region;

import yongtable.tabletest.domain.user.User;

import javax.persistence.*;

@Entity
@Table(name = "yong_user_region")
public class UserRegion {

    @Id @GeneratedValue
    @Column(name = "yong_user_region_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "yong_user_id")
    private User user;

    @Column(name = "latitude")  // 위도
    private float latitude;

    @Column(name = "langitude")  // 경도
    private float langitude;

    @Column(name = "region_code")
    private String regionCode;
}
