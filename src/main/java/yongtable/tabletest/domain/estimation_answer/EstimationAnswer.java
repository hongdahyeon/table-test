package yongtable.tabletest.domain.estimation_answer;

import yongtable.tabletest.domain.moving_expenses.MovingExpenses;
import yongtable.tabletest.global.base.BaseEntity;

import javax.persistence.*;

@Entity
@Table(name = "yong_estimation_answer")
public class EstimationAnswer extends BaseEntity {

    @Id @GeneratedValue
    @Column(name = "yong_estimation_answer_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "yong_moving_expenses_id")
    private MovingExpenses movingExpenses;

    @Column(name = "open_at")
    private String openAt;

    @Column(name = "use_at")
    private String useAt;

    @Column(name = "image_id")
    private Long imageId;

    @Column(name = "content")
    private String content;
}
