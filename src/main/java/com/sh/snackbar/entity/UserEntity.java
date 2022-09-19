package com.sh.snackbar.entity;


import com.sh.snackbar.utils.Role;
import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * 이용자 테이블
 *
 */
@Data
@Entity
public class UserEntity {

    /** key */
    @Id
    @GeneratedValue
    private long id;

    /** 사용자 ID */
    private String userId;

    /** 사용자 비빌번호 */
    private String password;

    /** 사용자 이름 */
    private String userName;

    /** 이용자 구분 사용자,관리자 */
    @Enumerated(EnumType.STRING)
    private Role role;

    /** 주문 목록과 join */
    @OneToMany(mappedBy = "userEntity")
    private List<OrderEntity> orderEntity = new ArrayList<>();

}
