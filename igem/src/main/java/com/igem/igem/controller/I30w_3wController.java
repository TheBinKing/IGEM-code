package com.igem.igem.controller;

import com.igem.server.dto.PageDto;
import com.igem.server.dto.ResponseDto;
import com.igem.server.service.I30w_3wService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping(value = "/30w_3w")
@Api(tags = "30w_3w")
public class I30w_3wController {

    public static final String BUSINESS_NAME = "大章";

    @Resource
    private I30w_3wService i30w_3wService;

    @ApiOperation("通过分页器查看所有30w_3w")
    @PostMapping(value = "/list", produces = MediaType.APPLICATION_PROBLEM_JSON_VALUE)
    public ResponseDto list(@RequestBody PageDto pageDto) {
        ResponseDto responseDto = new ResponseDto();
        i30w_3wService.list(pageDto);
        responseDto.setContent(pageDto);
        return responseDto;
    }
}


