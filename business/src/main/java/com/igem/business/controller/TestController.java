package com.igem.business.controller;

import com.igem.server.domain.Test;
import com.igem.server.service.TestService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@Api(tags="helloWorld测试接口")
public class TestController {

    @Resource
    private TestService testService;

    @ApiOperation("测试返回最简单的json数据")
    @RequestMapping(value = "/test",produces = MediaType.APPLICATION_PROBLEM_JSON_VALUE)
    public List<Test> test() {
        return testService.list();
    }
}
