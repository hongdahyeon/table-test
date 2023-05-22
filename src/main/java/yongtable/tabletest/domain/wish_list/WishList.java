package yongtable.tabletest.domain.wish_list;

import yongtable.tabletest.domain.moving_company.MovingCompany;
import yongtable.tabletest.domain.user.User;
import yongtable.tabletest.global.base.BaseTimeEntity;

import javax.persistence.*;

@Entity
@Table(name = "yong_wish_list")
public class WishList extends BaseTimeEntity {

    @Id @GeneratedValue
    @Column(name = "yong_wish_list_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "yong_user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "yong_moving_company_id")
    private MovingCompany movingCompany;

    @Column(name = "use_at")
    private String useAt;
}
