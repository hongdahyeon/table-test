package yongtable.tabletest.domain.furniture_detail;

import yongtable.tabletest.domain.furniture_detail_group.FurnitureDetailGroup;

import javax.persistence.*;

@Entity
@Table(name = "yong_furniture_detail")
public class FurnitureDetail {

    @Id @GeneratedValue
    @Column(name = "yong_furniture_detail_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "yong_furniture_detail_group_id")
    private FurnitureDetailGroup furnitureDetailGroup;

    @Column(name = "detail_name")
    private String detailName;

    @Column(name = "description")
    private String description;
}
