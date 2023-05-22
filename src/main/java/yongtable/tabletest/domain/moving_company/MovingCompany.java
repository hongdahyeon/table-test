package yongtable.tabletest.domain.moving_company;

import javax.persistence.*;

@Entity
@Table(name = "yong_moving_company")
public class MovingCompany {

    @Id @GeneratedValue
    @Column(name = "yong_moving_company_id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "person_count")
    private String personCount;

    @Column(name = "history")
    private Integer history;

    @Column(name = "use_count")
    private Integer useCount;

    @Column(name = "image_group_id")
    private Long imageGroupId;

    @Column(name = "latitude")
    private float latitude;

    @Column(name = "langitude")
    private float langitude;

    @Column(name = "company_name")
    private String companyName;

    @Column(name = "ceo_name")
    private String ceoName;

    @Column(name = "business_number")
    private String businessNumber;

    @Column(name = "business_address")
    private String businessAddress;
}
