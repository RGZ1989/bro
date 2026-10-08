package com.zhurongguang.servicemap.controller;

import com.zhurongguang.internalcommon.dto.ResponseResult;
import com.zhurongguang.servicemap.service.TrackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.ws.RespectBinding;

@RestController
@RequestMapping("/track")
public class TrackController {

    @Autowired
    TrackService trackService;

    @PostMapping("/add")
    public ResponseResult add(String tid){

        return trackService.add(tid);
    }
}
