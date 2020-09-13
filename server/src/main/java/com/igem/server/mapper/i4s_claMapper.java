package com.igem.server.mapper;

import com.igem.server.domain.i4s_cla;
import com.igem.server.domain.i4s_claExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface i4s_claMapper {
    long countByExample(i4s_claExample example);

    int deleteByExample(i4s_claExample example);

    int deleteByPrimaryKey(String domain);

    int insert(i4s_cla record);

    int insertSelective(i4s_cla record);

    List<i4s_cla> selectByExample(i4s_claExample example);

    i4s_cla selectByPrimaryKey(String domain);

    int updateByExampleSelective(@Param("record") i4s_cla record, @Param("example") i4s_claExample example);

    int updateByExample(@Param("record") i4s_cla record, @Param("example") i4s_claExample example);

    int updateByPrimaryKeySelective(i4s_cla record);

    int updateByPrimaryKey(i4s_cla record);
}