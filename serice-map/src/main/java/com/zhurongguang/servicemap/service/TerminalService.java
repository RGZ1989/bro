package com.zhurongguang.servicemap.service;

import com.zhurongguang.internalcommon.constant.AmapConfigConstants;
import com.zhurongguang.internalcommon.dto.ResponseResult;
import com.zhurongguang.internalcommon.responese.TerminalResponse;
import com.zhurongguang.internalcommon.responese.TrsearchResponse;
import com.zhurongguang.servicemap.remote.TerminalClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TerminalService {

    @Autowired
    TerminalClient terminalClient;

    public ResponseResult<TerminalResponse> add(String name , String desc){

        return terminalClient.add(name , desc);
    }


    public ResponseResult<List<TerminalResponse>> aroundsearch(String center, Integer radius){

        return terminalClient.aroundsearch(center,radius);
    }

    public ResponseResult<TrsearchResponse> trsearch(String tid , Long starttime , Long endtime){

        return terminalClient.trsearch(tid,starttime,endtime);
    }

}
