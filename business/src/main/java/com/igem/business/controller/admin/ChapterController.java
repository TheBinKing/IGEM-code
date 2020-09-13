package com.igem.business.controller.admin;

import com.igem.server.dto.ChapterDto;
import com.igem.server.dto.PageDto;
import com.igem.server.dto.ResponseDto;
import com.igem.server.service.ChapterService;
import com.igem.server.util.ValidatorUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping(value = "/admin/chapter")
@Api(tags = "测试章节的增删查改")
public class ChapterController {

    public static final String BUSINESS_NAME = "大章";

    @Resource
    private ChapterService chapterService;

    @ApiOperation("通过分页器查看列表所有信息")
    @PostMapping(value = "/list",produces = MediaType.APPLICATION_PROBLEM_JSON_VALUE)
    public ResponseDto list(@RequestBody @ApiParam(name="分页器参数",value="1. 注意参数page是从1开始的（而不是0）;\n" +
            "2. 参数size为0时即可请求列表所有信息\n用右侧的Model Schema;\n3. 理论上也能请求成功，但一般只需如下json格式：{\n" +
            "    \"size\":\"0\",\n" +
            "    \"page\":\"1\"\n" +
            "}",required=true) PageDto pageDto) {
        ResponseDto responseDto = new ResponseDto();
        chapterService.list(pageDto);
        responseDto.setContent(pageDto);
        return responseDto;
    }

    @ApiOperation(value = "新增或更新内容")
    @PostMapping(value = "/save",produces = MediaType.APPLICATION_PROBLEM_JSON_VALUE)
    public ResponseDto save(@RequestBody @ApiParam(name="json参数",value="1. 名称不为空，课程ID长度1-8。\n 2. 当有传入json中，有参数id时，为更新功能；当没有id时，后端会创建一个id，为新增功能") ChapterDto chapterDto) {

            //保存校验
            ValidatorUtil.require(chapterDto.getName(),"名称");
            ValidatorUtil.require(chapterDto.getCourseId(),"课程ID");
            ValidatorUtil.length(chapterDto.getCourseId(),"课程ID",1,8);


        ResponseDto responseDto = new ResponseDto();
        chapterService.save(chapterDto);
        responseDto.setContent(chapterDto);
        return responseDto;
    }

    @ApiOperation("删除一条内容")
    @DeleteMapping(value = "/delete/{id}", produces = MediaType.APPLICATION_PROBLEM_JSON_VALUE)
    public ResponseDto save(@PathVariable @ApiParam(name="id",value="该内容的id",required=true) String id) {
        ResponseDto responseDto = new ResponseDto();
        chapterService.delete(id);
        return responseDto;
    }
}
