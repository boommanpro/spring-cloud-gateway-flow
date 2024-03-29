package cn.boommanpro.businessexample1.controller;

import cn.boommanpro.businessexample1.service.BusinessExample2Service;
import cn.boommanpro.common.ResultVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangqimeng
 * @date 2019/12/4 20:45
 */
@Slf4j
@RestController
@RequestMapping("test")
public class TestController {

    @Autowired
    private BusinessExample2Service businessExample2Service;


    @GetMapping
    public ResultVo test(){
        log.info("businessExample1:{}","test");
        return businessExample2Service.test();
    }
}
