package yongtable.tabletest.domain.post;

import yongtable.tabletest.domain.file_group.FileGroup;
import yongtable.tabletest.domain.post_category.PostCategory;
import yongtable.tabletest.global.base.BaseEntity;

import javax.persistence.*;

@Entity
@Table(name = "yong_post")
public class Post extends BaseEntity {

    @Id @GeneratedValue
    @Column(name = "yong_post_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "yong_post_category_id")
    private PostCategory postCategory;

    @ManyToOne
    @JoinColumn(name = "yong_file_group_id")
    private FileGroup fileGroup;

    @Column(name = "title")
    private String title;

    @Column(name = "content")
    private String content;

    @Column(name = "view_count")
    private Integer viewCount;
}
