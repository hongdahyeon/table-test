package yongtable.tabletest.domain.estimation;

import yongtable.tabletest.domain.user.User;
import yongtable.tabletest.global.base.BaseEntity;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * > 1유저는 여러 견적을 작성할 수 있다.
 * -> 각 견적에는 '상태'가 있다. (moving_status)
 * -> 각 견적에는 업체로부터 비용 견적을 받는다. (moving_expenses)
 * -> 각 견적에 대해 업체로부터 받은 비용 견적을 토대로 댓글을 주고 받는다. (estimation_answer)
 * -> 각 견적에 대해선 '출발/도착' 정보가 담긴다. (departure_arrival)
 * */
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
