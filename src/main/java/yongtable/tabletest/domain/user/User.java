package yongtable.tabletest.domain.user;

import yongtable.tabletest.global.base.BaseTimeEntity;

import javax.persistence.*;

@Entity
@Table(name = "yong_user")
public class User extends BaseTimeEntity {

    @Id @GeneratedValue
    @Column(name = "yong_user_id")
    private Long id;

    @Column(name = "nickname")
    private String nickname;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "full_name")
    private String fullName;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "post_number")
    private String postNumber;

    @Embedded
    private Address address;

    @Column(name = "notification_enabled")
    private String notificationEnabled;

}
