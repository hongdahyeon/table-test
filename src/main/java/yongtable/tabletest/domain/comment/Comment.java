package yongtable.tabletest.domain.comment;

import yongtable.tabletest.domain.post.Post;
import yongtable.tabletest.global.base.BaseEntity;

import javax.persistence.*;

@Entity
@Table(name = "yong_comment")
public class Comment extends BaseEntity {

    @Id @GeneratedValue
    @Column(name = "yong_comment_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "yong_post_id")
    private Post post;

    @Column(name = "title")
    private String title;

    @Column(name = "content")
    private String content;
}
