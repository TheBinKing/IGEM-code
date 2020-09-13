package com.igem.igem.controller;

import com.igem.server.dto.PageDto;
import com.igem.server.dto.ResponseDto;
import com.igem.server.service.I3w_100Service;
import com.igem.server.service.I3w_typService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping(value = "/3w_typ")
@Api(tags = "3w_typ")
public class I3w_typController {


    @Resource
    private I3w_typService i3w_typService;

    @ApiOperation("通过分页器查看所有3w_typ")
    @PostMapping(value = "/list", produces = MediaType.APPLICATION_PROBLEM_JSON_VALUE)
    public ResponseDto list(@RequestBody PageDto pageDto) {
        ResponseDto responseDto = new ResponseDto();
        i3w_typService.list(pageDto);
        responseDto.setContent(pageDto);
        return responseDto;
    }
}


