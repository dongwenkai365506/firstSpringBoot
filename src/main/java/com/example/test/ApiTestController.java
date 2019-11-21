package com.example.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

/**
 * API测试接口
 *
 * @author theodo
 * @email 36780272@qq.com
 * @date 2017-10-23 15:47
 */
@RestController
@RequestMapping("/api")
public class ApiTestController {

    private static final Logger log = LoggerFactory.getLogger(ApiTestController.class);

    /**
     * 获取用户信息
     */
    @PostMapping(value = "test")
    public Object userInfo(@RequestBody String param){
        log.info(String.format("/api/test param = %s", param));
        return param;
    }
}
