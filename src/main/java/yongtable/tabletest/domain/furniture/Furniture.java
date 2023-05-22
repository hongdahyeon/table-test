package yongtable.tabletest.domain.furniture;

import javax.persistence.*;

@Entity
@Table(name = "yong_furniture")
public class Furniture {

    @Id @GeneratedValue
    @Column(name = "yong_furniture_id")
    private Long id;

    @Column(name = "furniture_name")
    private String furnitureName;

    @Column(name = "furniture_upper_id")
    private Long furnitureUpperId;

    @Column(name = "icon_image_id")
    private Long iconImageId;
}
