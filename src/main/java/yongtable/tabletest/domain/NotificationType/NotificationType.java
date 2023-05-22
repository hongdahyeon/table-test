package yongtable.tabletest.domain.NotificationType;

import yongtable.tabletest.global.base.BaseEntity;

import javax.persistence.*;

@Entity
@Table(name = "notification_type")
public class NotificationType extends BaseEntity {

    @Id @GeneratedValue
    @Column(name = "notification_type_id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

}
