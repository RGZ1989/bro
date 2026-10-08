package com.zhurongguang.apiBoss.service;

import com.zhurongguang.apiBoss.remote.ServiceDriverUserClient;
import com.zhurongguang.internalcommon.dto.Car;
import com.zhurongguang.internalcommon.dto.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarService {

    @Autowired
    ServiceDriverUserClient serviceDriverUserClient;

    public ResponseResult addCar(Car car){
        return serviceDriverUserClient.addCar(car);
    }
}
