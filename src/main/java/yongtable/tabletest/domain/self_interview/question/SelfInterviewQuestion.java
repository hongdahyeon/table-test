package yongtable.tabletest.domain.self_interview.question;

import yongtable.tabletest.global.base.BaseTimeEntity;

import javax.persistence.*;

@Entity
@Table(name = "yong_self_interview_question")
public class SelfInterviewQuestion extends BaseTimeEntity {

    @Id @GeneratedValue
    @Column(name = "yong_self_interview_question_id")
    private Long id;

    @Column(name = "question_content")
    private String questionContent;
}
