package com.haoliang.foo.core;

import com.haoliang.foo.repository.FooRepositoryApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Created by xiaoliangzi on 2017/10/29.
 */
@ComponentScan(value = {"com.haoliang.foo.core"})
@Import(value = {FooRepositoryApplicationContext.class})
@Configuration
public class FooCoreApplicationContext {
}
