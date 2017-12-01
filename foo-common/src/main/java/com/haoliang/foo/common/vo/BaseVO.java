package com.haoliang.foo.common.vo;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * Created by xiaoliangzi on 2017/12/1.
 */
@Getter
@Setter
public class BaseVO implements Serializable {

    private Integer id;

    private String name;

    private Integer foo;

    private Integer bar;

}
