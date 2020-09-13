package com.igem.igem.controller;

import com.igem.server.dto.PageDto;
import com.igem.server.dto.ResponseDto;
import com.igem.server.service.I4s_claService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping(value = "/4s_cla")
@Api(tags = "4s_cla")
public class I4s_claController {

    public static final String BUSINESS_NAME = "大章";

    @Resource
    private I4s_claService i4s_claService;

    @ApiOperation("通过分页器查看所有4s_cla")
    @PostMapping(value = "/list", produces = MediaType.APPLICATION_PROBLEM_JSON_VALUE)
    public ResponseDto list(@RequestBody PageDto pageDto) {
        ResponseDto responseDto = new ResponseDto();
        i4s_claService.list(pageDto);
        responseDto.setContent(pageDto);
        return responseDto;
    }
}


