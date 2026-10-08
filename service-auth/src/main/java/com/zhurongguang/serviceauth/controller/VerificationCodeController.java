package com.zhurongguang.serviceauth.controller;

import com.zhurongguang.internalcommon.dto.ResponseResult;
import com.zhurongguang.serviceauth.request.CheckVerificationCodeDTO;
import com.zhurongguang.serviceauth.request.SendVerificationCodeDTO;
import com.zhurongguang.serviceauth.service.VerificationCodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/verification-code")
public class VerificationCodeController {

    @Autowired
    private VerificationCodeService verificationCodeService;



    /**
     * 发送验证码
     *
     * @param verificationCodeDTO
     * @return
     */
    @PostMapping("/generator")
    public ResponseResult verificationCode(@Validated @RequestBody SendVerificationCodeDTO verificationCodeDTO) {


        String phone = verificationCodeDTO.getPhone();
        String identity = verificationCodeDTO.getIdentity();

        return verificationCodeService.generatorCode(phone,identity);

    }

    @PostMapping("/check")
    public ResponseResult checkVerificationCode(@Validated @RequestBody CheckVerificationCodeDTO checkVerificationCodeDTO) {

        String phone = checkVerificationCodeDTO.getPhone();
        String identity = checkVerificationCodeDTO.getIdentity();
        String verificationCode = checkVerificationCodeDTO.getVerificationCode();

        return verificationCodeService.checkCode(phone,verificationCode, identity);

    }
}