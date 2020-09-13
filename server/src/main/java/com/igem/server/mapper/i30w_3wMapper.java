package com.igem.server.mapper;

import com.igem.server.domain.i30w_3w;
import com.igem.server.domain.i30w_3wExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface i30w_3wMapper {
    long countByExample(i30w_3wExample example);

    int deleteByExample(i30w_3wExample example);

    int deleteByPrimaryKey(String domain);

    int insert(i30w_3w record);

    int insertSelective(i30w_3w record);

    List<i30w_3w> selectByExample(i30w_3wExample example);

    i30w_3w selectByPrimaryKey(String domain);

    int updateByExampleSelective(@Param("record") i30w_3w record, @Param("example") i30w_3wExample example);

    int updateByExample(@Param("record") i30w_3w record, @Param("example") i30w_3wExample example);

    int updateByPrimaryKeySelective(i30w_3w record);

    int updateByPrimaryKey(i30w_3w record);
}