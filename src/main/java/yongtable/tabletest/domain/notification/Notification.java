package yongtable.tabletest.domain.notification;

import yongtable.tabletest.domain.notification_type.NotificationType;
import yongtable.tabletest.domain.user.User;
import yongtable.tabletest.global.base.BaseTimeEntity;

import javax.persistence.*;

@Entity
@Table(name = "yong_notification")
public class Notification extends BaseTimeEntity {

    @Id @GeneratedValue
    @Column(name = "yong_notification_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "yong_user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "yong_notification_type_id")
    private NotificationType notificationType;

    @Column(name = "message")
    private String message;

    @Column(name = "is_read")
    private String isRead;

    @Column(name = "reference_id")
    private String referenceId;

    @Column(name = "reference_url")
    private String referenceUrl;
}
