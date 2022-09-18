package com.sh.snackbar.entity;

import com.sh.snackbar.utils.OrderStatus;
import lombok.Data;

import javax.persistence.*;

/**
 * 주문 목록
 */

@Data
@Entity
public class OrderEntity {

    /** key */
    @Id
    @GeneratedValue
    private long id;

    /** 상품 상태 */
    @Enumerated(EnumType.STRING)
    private OrderStatus orderStatus;

    /** 사용자 join */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id")
    private UserEntity userEntity;

}
