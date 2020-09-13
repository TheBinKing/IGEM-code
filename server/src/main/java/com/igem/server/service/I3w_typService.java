package com.igem.server.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.igem.server.domain.i3w_typ;
import com.igem.server.domain.i3w_typExample;
import com.igem.server.dto.PageDto;
import com.igem.server.dto.i3w_typDto;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class I3w_typService {

    @Resource
    private com.igem.server.mapper.i3w_typMapper i3w_typMapper;

    public void list(PageDto pageDto) {
        PageHelper.startPage(pageDto.getPage(), pageDto.getSize());
        i3w_typExample i_3w_typExample = new i3w_typExample();
//        i_3w_typExample.createCriteria().andIdEqualTo("1");
//        i_3w_typExample.setOrderByClause("id asc");
        List<i3w_typ> i_3w_typList = i3w_typMapper.selectByExample(i_3w_typExample);
        PageInfo<i3w_typ> pageInfo = new PageInfo<>(i_3w_typList);
        pageDto.setTotal(pageInfo.getTotal());
        List<i3w_typDto> i_3w_typDtoList = new ArrayList<i3w_typDto>();
        for (int i = 0; i < i_3w_typList.size(); i++) {
            i3w_typ i3w_typ = i_3w_typList.get(i);
            i3w_typDto i3w_typDto = new i3w_typDto();
            //BeanUtils用于实体间的复制
            BeanUtils.copyProperties(i3w_typ, i3w_typDto);
            i_3w_typDtoList.add(i3w_typDto);
        }
        pageDto.setList(i_3w_typDtoList);
    }
}
