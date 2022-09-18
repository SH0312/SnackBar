package com.sh.snackbar.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * 상품 테이블
 */
@Data
@Entity
public class ProductEntity {

    /** key */
    @Id
    @GeneratedValue
    private long id;

    /** 상품 명 */
    private String ProductName;

    /** 삭제 유무 */
    private boolean del_yn;

}
