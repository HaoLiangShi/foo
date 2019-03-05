package com.haoliang.foo.api.repository;

import com.haoliang.foo.api.BaseApiTest;
import com.haoliang.foo.domain.one.ABase;
import com.haoliang.foo.repository.one.ABaseRepository;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

/**
 * Created by xiaoliangzi on 2019/3/5.
 */
@Slf4j
public class ABaseRepoTest extends BaseApiTest {

    @Autowired
    private ABaseRepository aBaseRepository;

    @Test
    public void repoTest() {
        ABase aBase1 = new ABase();
        aBase1.setGoodsId(123L);
        aBaseRepository.insert(aBase1);

        ABase aBase2 = new ABase();
        aBase2.setGoodsId(123L);
        aBase2.setGoodsName("123_name");
        aBaseRepository.insert(aBase2);

        List<ABase> list = aBaseRepository.selectByGoodsId(123L);

        ABase aBaseKey = aBaseRepository.selectById(1L);
    }

}
