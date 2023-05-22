package yongtable.tabletest.domain.moving_company_review;

import yongtable.tabletest.domain.moving_company.MovingCompany;
import yongtable.tabletest.global.base.BaseEntity;

import javax.persistence.*;

@Entity
@Table(name = "yong_moving_company_review")
public class MovingCompanyReview extends BaseEntity {

    @Id @GeneratedValue
    @Column(name = "yong_moving_company_review_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "yong_moving_company_id")
    private MovingCompany movingCompany;

    @Column(name = "content")
    private String content;

    @Column(name = "image_group_id")
    private Long imageGroupId;

    @Column(name = "use_at")
    private String useAt;
}
