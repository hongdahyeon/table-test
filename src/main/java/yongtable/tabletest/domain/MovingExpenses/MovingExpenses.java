package yongtable.tabletest.domain.MovingExpenses;

import yongtable.tabletest.domain.Estimation.Estimation;
import yongtable.tabletest.global.base.BaseEntity;

import javax.persistence.*;

@Entity
@Table(name = "yong_moving_expenses")
public class MovingExpenses extends BaseEntity {

    @Id @GeneratedValue
    @Column(name = "yong_moving_expenses_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "yong_estimation_id")
    private Estimation estimation;

    @Column(name = "amount")
    private Integer amount;

    @Column(name = "message")
    private String message;
}
