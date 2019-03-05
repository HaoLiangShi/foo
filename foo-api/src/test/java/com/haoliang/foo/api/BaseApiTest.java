package com.haoliang.foo.api;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by xiaoliangzi on 2017/10/29.
 */
@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest(classes = {FooApiApplicationContext.class})
public class BaseApiTest {

    @Test
    public void baseTest() {
        log.info("Hello ! This fucking world !");
    }

}
