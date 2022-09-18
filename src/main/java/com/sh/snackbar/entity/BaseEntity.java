package com.sh.snackbar.entity;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

/**
 * 모든 테이블에 추가될 column 정보
 */
@Data
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class BaseEntity {

    /** 최초 등록일 */
    @CreatedDate
    @Column(updatable = false)
    private LocalDateTime createDate;

    /** 수정일 */
    @LastModifiedDate
    private LocalDateTime updateDate;
}