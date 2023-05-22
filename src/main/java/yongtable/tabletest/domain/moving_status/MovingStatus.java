package yongtable.tabletest.domain.moving_status;

import yongtable.tabletest.domain.estimation.Estimation;
import yongtable.tabletest.global.base.BaseEntity;

import javax.persistence.*;

@Entity
@Table(name = "yong_moving_status")
public class MovingStatus extends BaseEntity {

    @Id @GeneratedValue
    @Column(name = "yong_moving_status_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "yong_estimation_id")
    private Estimation estimation;

    @Enumerated(EnumType.STRING)
    @Column(name = "moving_status_code")           // 이사 상태 코드
    private MovingStatusCode movingStatusCode;
}
