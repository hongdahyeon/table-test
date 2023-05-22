package yongtable.tabletest.domain.UserFurnitureListDetail;

import yongtable.tabletest.domain.FurnitureDetail.FurnitureDetail;
import yongtable.tabletest.domain.UserFurnitureList.UserFurnitureList;

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
