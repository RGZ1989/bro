package com.zhurongguang.apipassenger.service;

import com.zhurongguang.apipassenger.remote.ServicePassengerUserClient;
import com.zhurongguang.internalcommon.dto.PassengerUser;
import com.zhurongguang.internalcommon.dto.ResponseResult;
import com.zhurongguang.internalcommon.dto.TokenResult;
import com.zhurongguang.internalcommon.request.VerificationCodeDTO;
import com.zhurongguang.internalcommon.util.JwtUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class UserService {

    @Autowired
    ServicePassengerUserClient servicePassengerUserClient;

    public ResponseResult getUserByAccessToken(String accessToken) {
        log.info("accessToken:" + accessToken);
        // 解析accessToken，拿到手机号
        TokenResult tokenResult = JwtUtils.checkToken(accessToken);
        String phone = tokenResult.getPhone();
        log.info("手机号：" + phone);

        // 根据手机号查询用户信息
        ResponseResult<PassengerUser> userByPhone = servicePassengerUserClient.getUserByPhone(phone);

        return ResponseResult.success(userByPhone.getData());
    }
}