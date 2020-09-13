package com.igem.server.mapper;

import com.igem.server.domain.i3w_typ;
import com.igem.server.domain.i3w_typExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface i3w_typMapper {
    long countByExample(i3w_typExample example);

    int deleteByExample(i3w_typExample example);

    int deleteByPrimaryKey(Integer qryCla);

    int insert(i3w_typ record);

    int insertSelective(i3w_typ record);

    List<i3w_typ> selectByExample(i3w_typExample example);

    i3w_typ selectByPrimaryKey(Integer qryCla);

    int updateByExampleSelective(@Param("record") i3w_typ record, @Param("example") i3w_typExample example);

    int updateByExample(@Param("record") i3w_typ record, @Param("example") i3w_typExample example);

    int updateByPrimaryKeySelective(i3w_typ record);

    int updateByPrimaryKey(i3w_typ record);
}