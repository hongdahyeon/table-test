package yongtable.tabletest.domain.EstimationAnswer;

import yongtable.tabletest.domain.Estimation.Estimation;
import yongtable.tabletest.global.base.BaseEntity;

import javax.persistence.*;

@Entity
@Table(name = "yong_estimation_answer")
public class EstimationAnswer extends BaseEntity {

    @Id @GeneratedValue
    @Column(name = "yong_estimation_answer_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "yong_estimation_id")
    private Estimation estimation;

    @Column(name = "open_at")
    private String openAt;

    @Column(name = "use_at")
    private String useAt;

    @Column(name = "image_id")
    private Long imageId;

    @Column(name = "content")
    private String content;
}
