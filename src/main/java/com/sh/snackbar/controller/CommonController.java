package com.sh.snackbar.controller;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 공통 기능 Controller
 *
 */
@RestController
@Api(value = "공통 기능 API", tags = "공통 기능 API")
@RequestMapping("/common")
@AllArgsConstructor
public class CommonController {

    /**
     * 상품을 조회한다.
     * @return
     */
    @GetMapping(value = "/getProductList", produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(value="상품 조회",notes="등록된 상품을 조회한다.")
    public ResponseEntity<?> getProductList(){
        return null;
    }
    /**
     * 웨이팅을 조회한다.
     * @return
     */
    @GetMapping(value = "/getWaitingCount", produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(value="상품 대기 건수 조회",notes="이미 주문된 상품 대기 건수를 조회한다.")
    public ResponseEntity<?> getWaitingCount(){
        return null;
    }
}