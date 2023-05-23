package yongtable.tabletest.domain.moving_company_sns;

import yongtable.tabletest.domain.moving_company.MovingCompany;

import javax.persistence.*;

@Entity
@Table(name = "yong_moving_company_sns")
public class MovingCompanySns {

    @Id @GeneratedValue
    @Column(name = "yong_moving_company_sns_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "yong_moving_company_id")
    private MovingCompany movingCompany;

    @Enumerated(EnumType.STRING)
    private SnsType snsType;

    @Column(name = "sns_url")
    private String snsUrl;
}
