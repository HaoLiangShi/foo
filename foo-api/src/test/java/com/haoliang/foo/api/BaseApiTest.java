package com.haoliang.foo.api;

import com.haoliang.foo.common.dto.BaseDTO;
import com.haoliang.foo.common.vo.BaseVO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.BeanUtils;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by xiaoliangzi on 2017/10/29.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class BaseApiTest {

    @Test
    public void BaseTest() {
        BaseVO baseVO = new BaseVO();
        baseVO.setId(1);
        baseVO.setName("22");
        baseVO.setFoo(333);
        baseVO.setBar(4444);
        BaseDTO baseDTO = new BaseDTO();
        BeanUtils.copyProperties(baseVO, baseDTO);
    }

}
