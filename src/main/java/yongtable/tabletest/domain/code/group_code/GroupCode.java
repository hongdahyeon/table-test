package yongtable.tabletest.domain.code.group_code;

import yongtable.tabletest.global.base.BaseTimeEntity;

import javax.persistence.*;

@Entity
@Table(name = "yong_group_code")
public class GroupCode extends BaseTimeEntity {

    @Id @GeneratedValue
    @Column(name = "yong_group_code_id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

}
