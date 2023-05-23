package yongtable.tabletest.domain.furniture_detail_group;

import yongtable.tabletest.domain.furniture.Furniture;

import javax.persistence.*;

@Entity
@Table(name = "yong_furniture_detail_group")
public class FurnitureDetailGroup {

    @Id @GeneratedValue
    @Column(name = "yong_furniture_detail_group_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "yong_furniture_id")
    private Furniture furniture;

    @Column(name = "group_name")
    private String groupName;

    @Column(name = "description")
    private String description;

}
