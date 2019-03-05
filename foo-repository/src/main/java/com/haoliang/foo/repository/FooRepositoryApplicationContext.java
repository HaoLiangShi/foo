package com.haoliang.foo.repository;

import com.haoliang.foo.common.FooCommonApplicationContext;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;

/**
 * Created by xiaoliangzi on 2017/10/29.
 */
@ComponentScan(value = {"com.haoliang.foo.repository"})
@Import(value = {FooCommonApplicationContext.class})
@ImportResource
// todo fix me basePackages如果路径不足够详细就会抛NoUniqueBeanDefinitionException
// eg: com.haoliang.foo.repository.one就会报错
@MapperScan(basePackages = "com.haoliang.foo.repository.one.mybatis.mappers",
        sqlSessionTemplateRef  = "mybatisSqlSessionTemplateOne")
@Configuration
public class FooRepositoryApplicationContext {

    @Bean(name = "dataSourceOne")
    @ConfigurationProperties(prefix = "spring.datasource.one")
    public DataSource dataSourceOne() {
        return DataSourceBuilder.create()
                .driverClassName("com.mysql.cj.jdbc.Driver")
                .url("jdbc:mysql://127.0.0.1:3306/mysql?zeroDateTimeBehavior=CONVERT_TO_NULL&useSSL=false&useUnicode=true&characterEncoding=UTF-8&serverTimezone=GMT")
                .username("root")
                .password("pass")
                .build();
    }

    @Bean(name = "mybatisSqlSessionFactoryOne")
    public SqlSessionFactory mybatisSqlSessionFactoryOne(@Qualifier("dataSourceOne") DataSource dataSource) throws Exception {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(dataSource);
        bean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources(
                "classpath*:/com/haoliang/foo/repository/one/mybatis/mappers/*.xml"));
        return bean.getObject();
    }

    @Bean(name = "mybatisSqlSessionTemplateOne")
    public SqlSessionTemplate mybatisMasterSqlSessionTemplate(@Qualifier("mybatisSqlSessionFactoryOne") SqlSessionFactory sqlSessionFactory) throws Exception {
        return new SqlSessionTemplate(sqlSessionFactory);
    }

}