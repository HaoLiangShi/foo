package com.haoliang.foo.repository.one.repo.impl;

import com.haoliang.foo.domain.one.ABase;
import com.haoliang.foo.domain.one.ABaseExample;
import com.haoliang.foo.repository.one.repo.ABaseRepository;
import com.haoliang.foo.repository.one.mybatis.mappers.ABaseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by xiaoliangzi on 2019/3/5.
 */
@Repository
public class ABaseRepositoryImpl implements ABaseRepository {

    @Autowired
    private ABaseMapper aBaseMapper;

    @Override
    public Integer insert(ABase aBase) {
        return aBaseMapper.insertSelective(aBase);
    }

    @Override
    public ABase selectById(Long id) {
        return aBaseMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<ABase> selectByGoodsId(Long goodsId) {
        ABaseExample example = new ABaseExample();
        example.createCriteria().andGoodsIdEqualTo(goodsId);
        return aBaseMapper.selectByExample(example);
    }

}
