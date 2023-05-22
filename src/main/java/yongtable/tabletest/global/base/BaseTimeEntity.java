package yongtable.tabletest.global.base;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@MappedSuperclass
public abstract class BaseTimeEntity {

    @CreatedDate
    @Column(name = "created_date", updatable = false)
    private String createdDate;

    @LastModifiedDate
    @Column(name = "updated_date")
    private String updatedDate;

    @PrePersist
    public void onPrePersist(){
        this.createdDate = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        this.updatedDate = this.createdDate;
    }

    @PreUpdate
    public void onPreUpdate(){
        this.updatedDate = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    }
}
