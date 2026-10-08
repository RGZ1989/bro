package com.zhurongguang.servicemap.service;

import com.zhurongguang.internalcommon.dto.ResponseResult;
import com.zhurongguang.internalcommon.request.PointRequest;
import com.zhurongguang.servicemap.remote.PointClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PointService {

    @Autowired
    PointClient pointClient;

    public ResponseResult upload(PointRequest pointRequest){

        return pointClient.upload(pointRequest);
    }
}
