package yongtable.tabletest.domain.file_group;

import yongtable.tabletest.global.base.BaseTimeEntity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "yong_file_group")
public class FileGroup extends BaseTimeEntity {

    @Id @GeneratedValue
    @Column(name = "yong_file_group_id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "parent_id")
    private FileGroup parent;

    @OneToMany(mappedBy = "parent", fetch = FetchType.LAZY)
    private List<FileGroup> child = new ArrayList<>();
}
