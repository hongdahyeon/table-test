package yongtable.tabletest.domain.FurnitureDetailGroup;

import yongtable.tabletest.domain.Furniture.Furniture;

import javax.persistence.*;

@Entity
@Table(name = "yong_furniture_detail_group")
public class FurnitureDetailGroup {

    @Id @GeneratedValue
    @Column(name = "yong_furniture_detail_group_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "yong_furniture_id")
    private Furniture furniture;

    @Column(name = "group_name")
    private String groupName;

    @Column(name = "description")
    private String description;

}
