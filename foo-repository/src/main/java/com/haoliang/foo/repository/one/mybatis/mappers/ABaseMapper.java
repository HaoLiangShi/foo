package com.haoliang.foo.repository.one.mybatis.mappers;

import com.haoliang.foo.domain.one.ABase;
import com.haoliang.foo.domain.one.ABaseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface ABaseMapper {
    long countByExample(ABaseExample example);

    int deleteByExample(ABaseExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ABase record);

    int insertSelective(ABase record);

    List<ABase> selectByExampleWithRowbounds(ABaseExample example, RowBounds rowBounds);

    List<ABase> selectByExample(ABaseExample example);

    ABase selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ABase record, @Param("example") ABaseExample example);

    int updateByExample(@Param("record") ABase record, @Param("example") ABaseExample example);

    int updateByPrimaryKeySelective(ABase record);

    int updateByPrimaryKey(ABase record);
}