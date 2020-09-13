package com.igem.igem.controller;

import com.igem.server.dto.PageDto;
import com.igem.server.dto.ResponseDto;
import com.igem.server.service.I3w_100Service;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping(value = "/3w_100")
@Api(tags = "3w_100")
public class I3w_100Controller {

    public static final String BUSINESS_NAME = "大章";

    @Resource
    private I3w_100Service i3w_100Service;

    @ApiOperation("通过分页器查看所有3w_100")
    @PostMapping(value = "/list", produces = MediaType.APPLICATION_PROBLEM_JSON_VALUE)
    public ResponseDto list(@RequestBody PageDto pageDto) {
        ResponseDto responseDto = new ResponseDto();
        i3w_100Service.list(pageDto);
        responseDto.setContent(pageDto);
        return responseDto;
    }
}


