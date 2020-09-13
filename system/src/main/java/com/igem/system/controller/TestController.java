package com.igem.system.controller;

import com.igem.server.domain.Test;
import com.igem.server.service.TestService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

public class TestController {
    @Resource
    private TestService testService;

    @RequestMapping(value = "/test",produces = MediaType.APPLICATION_PROBLEM_JSON_VALUE)
    public List<Test> test() {
        return testService.list();
    }
}
