package yongtable.tabletest.domain.estimation;

import yongtable.tabletest.domain.user.User;
import yongtable.tabletest.global.base.BaseEntity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "yong_estimation")
public class Estimation extends BaseEntity {

    @Id @GeneratedValue
    @Column(name = "yong_estimation_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "yong_user_id")
    private User user;

    @Column(name = "open_at")
    private String openAt;

    @Column(name = "use_at")
    private String useAt;

    @Column(name = "image_group_id")
    private Long imageGroupId;

    @Column(name = "moving_at")
    private LocalDateTime movingAt;

}
