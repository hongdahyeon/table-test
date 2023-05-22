package yongtable.tabletest.domain.user_furniture_list_detail;

import yongtable.tabletest.domain.furniture_detail.FurnitureDetail;
import yongtable.tabletest.domain.user_furniture_list.UserFurnitureList;

import javax.persistence.*;

@Entity
@Table(name = "yong_user_furnigure_list_detail")
public class UserFurnitureListDetail {

    @Id @GeneratedValue
    @Column(name = "yong_user_furnigure_list_detail_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "yong_user_furniture_list_id")
    private UserFurnitureList userFurnitureList;

    @OneToOne
    @JoinColumn(name = "yong_furniture_detail_id")
    private FurnitureDetail furnitureDetail;

}
