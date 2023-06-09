package yongtable.tabletest.global.base;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.LastModifiedBy;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class BaseEntity extends BaseTimeEntity{

    @CreatedBy
    @Column(name = "reg_id", updatable = false)
    private Long regId;

    @LastModifiedBy
    @Column(name = "updt_id")
    private Long updtId;

}
