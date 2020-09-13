package com.igem.igem.controller;

import com.igem.server.dto.PageDto;
import com.igem.server.dto.ResponseDto;
import com.igem.server.service.I100_typService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping(value = "/100_typ")
@Api(tags = "100_typ")
public class I100_typController {

    public static final String BUSINESS_NAME = "大章";

    @Resource
    private I100_typService i100_typService;

    @ApiOperation("通过分页器查看所有100_typ")
    @PostMapping(value = "/list", produces = MediaType.APPLICATION_PROBLEM_JSON_VALUE)
    public ResponseDto list(@RequestBody PageDto pageDto) {
        ResponseDto responseDto = new ResponseDto();
        i100_typService.list(pageDto);
        responseDto.setContent(pageDto);
        return responseDto;
    }
}


