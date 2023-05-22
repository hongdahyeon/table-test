package yongtable.tabletest.domain.moving_expenses;

import yongtable.tabletest.domain.estimation.Estimation;
import yongtable.tabletest.domain.moving_company.MovingCompany;
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

    @OneToOne
    @JoinColumn(name = "yong_moving_company_id")
    private MovingCompany movingCompany;

    @Column(name = "amount")
    private Integer amount;

    @Column(name = "message")
    private String message;
}