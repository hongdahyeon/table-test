package yongtable.tabletest.domain.Notification;

import yongtable.tabletest.domain.NotificationType.NotificationType;
import yongtable.tabletest.domain.User.User;
import yongtable.tabletest.global.base.BaseEntity;

import javax.persistence.*;

@Entity
@Table(name = "yong_notification")
public class Notification extends BaseEntity {

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
