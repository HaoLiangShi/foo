package com.haoliang.foo.common.dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * Created by xiaoliangzi on 2017/12/1.
 */
@Getter
@Setter
public class BaseDTO implements Serializable {

    private Integer id;

    private String name;

    private Long foo;

    private Integer bars;

}
