package com.zhurongguang.internalcommon.remote;

import com.zhurongguang.internalcommon.dto.ResponseResult;
import com.zhurongguang.internalcommon.request.ForecastPriceDTO;
import com.zhurongguang.internalcommon.request.PriceRuleIsNewRequest;
import com.zhurongguang.internalcommon.responese.ForecastPriceResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(value = "service-price", path = "/service-price")
public interface ServicePriceClient {

    @RequestMapping(method = RequestMethod.POST, value = "/forecast-price")
    public ResponseResult<ForecastPriceResponse> forecast(@RequestBody ForecastPriceDTO forecastPriceDTO);


    @PostMapping("/price-rule/is-new")
    public ResponseResult<Boolean> isNew(@RequestBody PriceRuleIsNewRequest priceRuleIsNewRequest);

    @RequestMapping(method = RequestMethod.GET,value = "/price-rule/if-exists/{cityCode}/{vehicleType}")
    public ResponseResult<Boolean> ifPriceExists(@PathVariable("cityCode") String cityCode, @PathVariable("vehicleType") String vehicleType);

    @RequestMapping(method = RequestMethod.POST, value = "/calculate-price")
    public ResponseResult<Double> calculatePrice(@RequestParam Integer distance , @RequestParam Integer duration, @RequestParam String cityCode, @RequestParam String vehicleType);



}
