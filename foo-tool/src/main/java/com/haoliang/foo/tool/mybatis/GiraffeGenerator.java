package com.haoliang.foo.tool.mybatis;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by xiaoliangzi on 26/07/18
 */
public class GiraffeGenerator {

    private static String fileName = "generatorConfigOne.xml";

    public static void main(String[] args) throws Exception {
        List<String> warnings = new ArrayList<>();
        Boolean overwrite = true;
        ConfigurationParser cp = new ConfigurationParser(warnings);
        Configuration config = cp.parseConfiguration(getResourceInClasspath(fileName));
        DefaultShellCallback callback = new DefaultShellCallback(overwrite);
        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
        myBatisGenerator.generate(null);

        warnings.forEach(System.out::println);
    }

    private static InputStream getResourceInClasspath(String path) {
        return Thread.currentThread().getContextClassLoader().getResourceAsStream(path);
    }

}