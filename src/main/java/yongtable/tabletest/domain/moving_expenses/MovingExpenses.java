package yongtable.tabletest.domain.moving_expenses;

import yongtable.tabletest.domain.estimation.Estimation;
import yongtable.tabletest.domain.moving_company.MovingCompany;
import yongtable.tabletest.global.base.BaseEntity;

import javax.persistence.*;

/**
 * > 유저는 여러개의 견적을 올릴 수 있다.
 * -> 1견적에는 여러명의 업체가 붙을 수 있다. 각 업체는 견적에 대해 비용을 제시한다.
 * ->> 1견적에 대한 업체의 견적 비용을 가지고 댓글을 주고 받는다. (estimation_answer)
 * */
@Entity
@Table(name = "yong_moving_expenses")
public class MovingExpenses extends BaseEntity {

    @Id @GeneratedValue
    @Column(name = "yong_moving_expenses_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "yong_estimation_id")
    private Estimation estimation;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "yong_moving_company_id")
    private MovingCompany movingCompany;

    @Column(name = "amount")
    private Integer amount;

    @Column(name = "message")
    private String message;
}
