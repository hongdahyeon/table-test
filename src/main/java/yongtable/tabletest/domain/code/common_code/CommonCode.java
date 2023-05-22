package yongtable.tabletest.domain.code.common_code;

import yongtable.tabletest.domain.code.group_code.GroupCode;
import yongtable.tabletest.global.base.BaseTimeEntity;

import javax.persistence.*;

@Entity
@Table(name = "yong_common_code")
public class CommonCode extends BaseTimeEntity {

    @Id @GeneratedValue
    @Column(name = "yong_common_code_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "yong_group_code_id")
    private GroupCode groupCode;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;
}
