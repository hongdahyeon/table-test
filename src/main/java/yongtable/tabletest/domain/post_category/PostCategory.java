package yongtable.tabletest.domain.post_category;

import yongtable.tabletest.global.base.BaseTimeEntity;

import javax.persistence.*;

@Entity
@Table(name = "yong_post_category")
public class PostCategory extends BaseTimeEntity {

    @Id @GeneratedValue
    @Column(name = "yong_post_category_id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;
}
