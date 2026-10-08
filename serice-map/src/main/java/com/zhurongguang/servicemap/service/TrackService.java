package com.zhurongguang.servicemap.service;

import com.zhurongguang.internalcommon.dto.ResponseResult;
import com.zhurongguang.internalcommon.responese.TrackResponse;
import com.zhurongguang.servicemap.remote.TrackClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TrackService {

    @Autowired
    TrackClient trackClient;

    public ResponseResult<TrackResponse> add(String tid){

        return trackClient.add(tid);
    }
}
