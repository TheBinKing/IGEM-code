package com.igem.server.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.igem.server.domain.i4s_cla;
import com.igem.server.domain.i4s_claExample;
import com.igem.server.dto.PageDto;
import com.igem.server.dto.i4s_claDto;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class I4s_claService {

    @Resource
    private com.igem.server.mapper.i4s_claMapper i4s_claMapper;

    public void list(PageDto pageDto) {
        PageHelper.startPage(pageDto.getPage(), pageDto.getSize());
        i4s_claExample i_4s_claExample = new i4s_claExample();
//        i_4s_claExample.createCriteria().andIdEqualTo("1");
//        i_4s_claExample.setOrderByClause("id asc");
        List<i4s_cla> i_4s_claList = i4s_claMapper.selectByExample(i_4s_claExample);
        PageInfo<i4s_cla> pageInfo = new PageInfo<>(i_4s_claList);
        pageDto.setTotal(pageInfo.getTotal());
        List<i4s_claDto> i_4s_claDtoList = new ArrayList<i4s_claDto>();
        for (int i = 0; i < i_4s_claList.size(); i++) {
            i4s_cla i4s_cla = i_4s_claList.get(i);
            i4s_claDto i4s_claDto = new i4s_claDto();
            //BeanUtils用于实体间的复制
            BeanUtils.copyProperties(i4s_cla, i4s_claDto);
            i_4s_claDtoList.add(i4s_claDto);
        }
        pageDto.setList(i_4s_claDtoList);
    }
}
