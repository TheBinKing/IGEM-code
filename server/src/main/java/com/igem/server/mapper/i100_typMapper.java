package com.igem.server.mapper;

import com.igem.server.domain.i100_typ;
import com.igem.server.domain.i100_typExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface i100_typMapper {
    long countByExample(i100_typExample example);

    int deleteByExample(i100_typExample example);

    int deleteByPrimaryKey(Integer qryCla);

    int insert(i100_typ record);

    int insertSelective(i100_typ record);

    List<i100_typ> selectByExample(i100_typExample example);

    i100_typ selectByPrimaryKey(Integer qryCla);

    int updateByExampleSelective(@Param("record") i100_typ record, @Param("example") i100_typExample example);

    int updateByExample(@Param("record") i100_typ record, @Param("example") i100_typExample example);

    int updateByPrimaryKeySelective(i100_typ record);

    int updateByPrimaryKey(i100_typ record);
}