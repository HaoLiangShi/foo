package com.haoliang.foo.api;

import com.haoliang.foo.core.FooCoreApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

/**
 * Created by xiaoliangzi on 2017/10/29.
 */
@SpringBootApplication
@Import(value = {
        FooCoreApplicationContext.class
})
public class FooApiApplicationContext {

    public static void main(String[] args) {
        SpringApplication.run(FooApiApplicationContext.class, args);
    }

}
