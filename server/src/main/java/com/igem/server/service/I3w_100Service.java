package com.igem.server.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.igem.server.domain.i3w_100;
import com.igem.server.domain.i3w_100Example;
import com.igem.server.dto.i3w_100Dto;
import com.igem.server.dto.PageDto;
import com.igem.server.mapper.i3w_100Mapper;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class I3w_100Service {

    @Resource
    private com.igem.server.mapper.i3w_100Mapper i3w_100Mapper;

    public void list(PageDto pageDto) {
        PageHelper.startPage(pageDto.getPage(), pageDto.getSize());
        i3w_100Example i_3w_100Example = new i3w_100Example();
//        i_3w_100Example.createCriteria().andIdEqualTo("1");
//        i_3w_100Example.setOrderByClause("id asc");
        List<i3w_100> i_3w_100List = i3w_100Mapper.selectByExample(i_3w_100Example);
        PageInfo<i3w_100> pageInfo = new PageInfo<>(i_3w_100List);
        pageDto.setTotal(pageInfo.getTotal());
        List<i3w_100Dto> i_3w_100DtoList = new ArrayList<i3w_100Dto>();
        for (int i = 0; i < i_3w_100List.size(); i++) {
            i3w_100 i3w_100 = i_3w_100List.get(i);
            i3w_100Dto i3w_100Dto = new i3w_100Dto();
            //BeanUtils用于实体间的复制
            BeanUtils.copyProperties(i3w_100, i3w_100Dto);
            i_3w_100DtoList.add(i3w_100Dto);
        }
        pageDto.setList(i_3w_100DtoList);
    }
}
