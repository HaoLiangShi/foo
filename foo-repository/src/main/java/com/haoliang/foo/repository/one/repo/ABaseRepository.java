package com.haoliang.foo.repository.one.repo;

import com.haoliang.foo.domain.one.ABase;

import java.util.List;

/**
 * Created by xiaoliangzi on 2019/3/5.
 */
public interface ABaseRepository {

    Integer insert(ABase aBase);

    ABase selectById(Long id);

    List<ABase> selectByGoodsId(Long goodsId);

}
