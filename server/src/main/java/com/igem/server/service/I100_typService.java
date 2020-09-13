package com.igem.server.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.igem.server.domain.i100_typ;
import com.igem.server.domain.i100_typExample;
import com.igem.server.dto.PageDto;
import com.igem.server.dto.i100_typDto;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class I100_typService {

    @Resource
    private com.igem.server.mapper.i100_typMapper i100_typMapper;

    public void list(PageDto pageDto) {
        PageHelper.startPage(pageDto.getPage(), pageDto.getSize());
        i100_typExample i_100_typExample = new i100_typExample();
//        i_100_typExample.createCriteria().andIdEqualTo("1");
//        i_100_typExample.setOrderByClause("id asc");
        List<i100_typ> i_100_typList = i100_typMapper.selectByExample(i_100_typExample);
        PageInfo<i100_typ> pageInfo = new PageInfo<>(i_100_typList);
        pageDto.setTotal(pageInfo.getTotal());
        List<i100_typDto> i_100_typDtoList = new ArrayList<i100_typDto>();
        for (int i = 0; i < i_100_typList.size(); i++) {
            i100_typ i100_typ = i_100_typList.get(i);
            i100_typDto i100_typDto = new i100_typDto();
            //BeanUtils用于实体间的复制
            BeanUtils.copyProperties(i100_typ, i100_typDto);
            i_100_typDtoList.add(i100_typDto);
        }
        pageDto.setList(i_100_typDtoList);
    }
}
