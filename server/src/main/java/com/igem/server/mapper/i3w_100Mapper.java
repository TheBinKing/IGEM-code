package com.igem.server.mapper;

import com.igem.server.domain.i3w_100;
import com.igem.server.domain.i3w_100Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface i3w_100Mapper {
    long countByExample(i3w_100Example example);

    int deleteByExample(i3w_100Example example);

    int deleteByPrimaryKey(String domain);

    int insert(i3w_100 record);

    int insertSelective(i3w_100 record);

    List<i3w_100> selectByExample(i3w_100Example example);

    i3w_100 selectByPrimaryKey(String domain);

    int updateByExampleSelective(@Param("record") i3w_100 record, @Param("example") i3w_100Example example);

    int updateByExample(@Param("record") i3w_100 record, @Param("example") i3w_100Example example);

    int updateByPrimaryKeySelective(i3w_100 record);

    int updateByPrimaryKey(i3w_100 record);
}