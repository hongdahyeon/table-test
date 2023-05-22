package yongtable.tabletest.domain.user_furniture_list;

import yongtable.tabletest.domain.estimation.Estimation;
import yongtable.tabletest.domain.furniture.Furniture;
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
