package com.bow.demo;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;

/**
 * @author vv
 * @since 2017/7/23.
 */
public class Demo {
    public static void main(String[] args) {
        System.out.println(JSON.toJSONString(new ArrayList()));
    }
}
