package yongtable.tabletest.domain.self_interview.answer;

import yongtable.tabletest.domain.moving_company.MovingCompany;
import yongtable.tabletest.domain.self_interview.question.SelfInterviewQuestion;
import yongtable.tabletest.global.base.BaseTimeEntity;

import javax.persistence.*;

@Entity
@Table(name = "yong_self_interview_answer")
public class SelfInterviewAnswer extends BaseTimeEntity {

    @Id
    @GeneratedValue
    @Column(name = "yong_self_interview_answer_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "yong_self_interview_question_id")
    private SelfInterviewQuestion selfInterviewQuestion;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "yong_moving_company_id")
    private MovingCompany movingCompany;

    @Column(name = "answer_content")
    private String answerContent;
}
