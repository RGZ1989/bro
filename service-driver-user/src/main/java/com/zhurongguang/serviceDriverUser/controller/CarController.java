package com.zhurongguang.serviceDriverUser.controller;

import com.zhurongguang.internalcommon.dto.Car;
import com.zhurongguang.internalcommon.dto.ResponseResult;
import com.zhurongguang.serviceDriverUser.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CarController {

    @Autowired
    CarService carService;

    @PostMapping("/car")
    public ResponseResult addCar(@RequestBody Car car){
        return carService.addCar(car);
    }

    @GetMapping("/car")
    public ResponseResult<Car> getCarById(Long carId){

        return carService.getCarById(carId);
    }
}
