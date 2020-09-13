package com.igem.server.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.igem.server.domain.i30w_3w;
import com.igem.server.domain.i30w_3wExample;
import com.igem.server.dto.PageDto;
import com.igem.server.dto.i30w_3wDto;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class I30w_3wService {

    @Resource
    private com.igem.server.mapper.i30w_3wMapper i30w_3wMapper;

    public void list(PageDto pageDto) {
        PageHelper.startPage(pageDto.getPage(), pageDto.getSize());
        i30w_3wExample i_30w_3wExample = new i30w_3wExample();
//        i_30w_3wExample.createCriteria().andIdEqualTo("1");
//        i_30w_3wExample.setOrderByClause("id asc");
        List<i30w_3w> i_30w_3wList = i30w_3wMapper.selectByExample(i_30w_3wExample);
        PageInfo<i30w_3w> pageInfo = new PageInfo<>(i_30w_3wList);
        pageDto.setTotal(pageInfo.getTotal());
        List<i30w_3wDto> i_30w_3wDtoList = new ArrayList<i30w_3wDto>();
        for (int i = 0; i < i_30w_3wList.size(); i++) {
            i30w_3w i30w_3w = i_30w_3wList.get(i);
            i30w_3wDto i30w_3wDto = new i30w_3wDto();
            //BeanUtils用于实体间的复制
            BeanUtils.copyProperties(i30w_3w, i30w_3wDto);
            i_30w_3wDtoList.add(i30w_3wDto);
        }
        pageDto.setList(i_30w_3wDtoList);
    }
}
