package com.tianyan.controller;

import com.tianyan.util.BaseResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @author lenovo
 * @Title: SuperOrderController
 * @Package com.tianyan.controller
 * @Description: SuperOrderController
 * @date 2024/3/14 15:15
 */
@RestController
@RequestMapping(value = "/superOrder")
public class SuperOrderController {

    private final Logger log = LoggerFactory.getLogger(SuperOrderController.class);
    @PostMapping(value = "/msgPush")
    public BaseResult getAlarmExporterView(@RequestBody Map<String, Object> params){
        log.info("param:{}", params);
        return BaseResult.successWithMsg("ok");
    }
}
