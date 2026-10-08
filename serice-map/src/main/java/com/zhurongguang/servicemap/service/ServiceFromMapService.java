package com.zhurongguang.servicemap.service;

import com.zhurongguang.internalcommon.dto.ResponseResult;
import com.zhurongguang.internalcommon.responese.ServiceResponse;
import com.zhurongguang.servicemap.remote.ServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceFromMapService {

    @Autowired
    private ServiceClient serviceClient;


    /**
     * 创建服务
     * @param name
     * @return
     */
    public ResponseResult add(String name){

        return serviceClient.add(name);

    }
}
