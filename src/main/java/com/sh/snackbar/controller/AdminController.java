package com.sh.snackbar.controller;

import com.sh.snackbar.utils.OnOff;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * 관리자 기능 Controller
 *
 */
@RestController
@Api(value = "관리자 기능 API", tags = "관리자 기능 API")
@RequestMapping("/admin")
@AllArgsConstructor
public class AdminController {

    /**
     * 매점 on off
     * @return
     */
    @GetMapping(value = "/snackBarOnOff", produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(value="매점 상태 변경",notes="매점 상태를 변경한다. ON / OFF")
    public ResponseEntity<?> SnackBarOnOff(@RequestParam OnOff onOff) {

        return null;
    }
    /**
     * 매점 on off 상태 확인
     * @return
     */
    @GetMapping(value = "/snackBarStatus", produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(value="매점 상태 변경",notes="매점 상태를 확인한다. ON / OFF")
    public ResponseEntity<?> SnackBaStatus() {

        return null;
    }

    /**
     * 관리자 추가
     * @return
     */
    @PostMapping(value = "/addAdmin", produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(value="매점 관리자 추가",notes="매점 관리자를 추가한다.")
    public ResponseEntity<?> addAdbmin(){
        return null;
    }

    /**
     * 관리자 삭제
     * @return
     */
    @PostMapping(value = "/delAdmin", produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(value="매점 관리자 삭제",notes="매점 관리자를 제거한다.")
    public ResponseEntity<?> delAdbmin(){
        return null;
    }

    /**
     * 주문 목록 확인
     * @return
     */
    @PostMapping(value = "/orderList", produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(value="주문 목록 확인",notes="주문 목록을 확인한다.")
    public ResponseEntity<?> orderList(){
        return null;
    }

    /**
     * 주문 상태 변경
     * @return
     */
    @PostMapping(value = "/orderStatusUpdate", produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(value="주문 상태를 변경",notes="주문 상태를 변경한다.")
    public ResponseEntity<?> orderStatusUpdate(){
        return null;
    }


    /**
     * 상품을 등록한다.
     * @return
     */
    @PostMapping(value = "/addProduct", produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(value="상품 등록",notes="상품을 등록한다.")
    public ResponseEntity<?> addProduct(){
        return null;
    }

    /**
     * 상품을 수정한다.
     * @return
     */
    @PostMapping(value = "/updateProduct", produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(value="상품 수정",notes="상품을 수정한다.")
    public ResponseEntity<?> updateProduct(){
        return null;
    }

    /**
     * 상품을 삭제한다.
     * @return
     */
    @PostMapping(value = "/delProduct", produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(value="상품 삭제",notes="상품을 삭제한다.")
    public ResponseEntity<?> delProduct(){
        return null;
    }
}
