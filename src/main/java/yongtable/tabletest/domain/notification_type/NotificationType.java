package yongtable.tabletest.domain.notification_type;

import yongtable.tabletest.global.base.BaseTimeEntity;

import javax.persistence.*;

@Entity
@Table(name = "yong_notification_type")
public class NotificationType extends BaseTimeEntity {

    @Id @GeneratedValue
    @Column(name = "yong_notification_type_id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

}
