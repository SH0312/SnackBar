package com.sh.snackbar.controller;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 사용자 기능 Controller
 *
 */
@RestController
@Api(value = "사용자 기능 API", tags = "사용자 기능 API")
@RequestMapping("/user")
@AllArgsConstructor
public class UserController {


    /**
     * 상품을 주문한다.
     * @return
     */
    @PostMapping(value = "/orderProduct", produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(value="상품 주문",notes="상품을 주문한다.")
    public ResponseEntity<?> orderProduct(){
        return null;
    }

    /**
     * 상품 주문을 취소한다.
     * 관리자가 준비중 이전일 떄만 가능.
     * @return
     */
    @GetMapping(value = "/cancelProduct", produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(value="상품 주문 취소",notes="상품 주문을 취소한다.")
    public ResponseEntity<?> cancelProduct(){
        return null;
    }

    /**
     * 상품 주문 상태를 확인한다.
     * @return
     */
    @GetMapping(value = "/statusProduct", produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(value="상품 주문 상태 확인",notes="상품 주문 상태를 확인한다.")
    public ResponseEntity<?> statusProduct(){
        return null;
    }

    /**
     * 상품 주문 이력을 확인한다.
     * @return
     */
    @GetMapping(value = "/orderHistory", produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(value="상품 주문 상태 확인",notes="상품 주문 이력을 확인한다.")
    public ResponseEntity<?> orderHistory(){
        return null;
    }
}
