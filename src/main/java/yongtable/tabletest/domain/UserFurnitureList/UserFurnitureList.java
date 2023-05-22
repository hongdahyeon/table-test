package yongtable.tabletest.domain.UserFurnitureList;

import yongtable.tabletest.domain.Estimation.Estimation;
import yongtable.tabletest.domain.Furniture.Furniture;
import yongtable.tabletest.global.base.BaseTimeEntity;

import javax.persistence.*;

@Entity
@Table(name = "yong_user_furniture_list")
public class UserFurnitureList extends BaseTimeEntity {

    @Id @GeneratedValue
    @Column(name = "yong_user_furniture_list_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "yong_furniture_id")
    private Furniture furniture;

    @ManyToOne
    @JoinColumn(name = "yong_estimation_id")
    private Estimation estimation;

    @Column(name = "use_at")
    private String useAt;
}
