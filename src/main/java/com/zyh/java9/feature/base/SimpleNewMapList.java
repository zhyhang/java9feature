package com.zyh.java9.feature.base;

import java.util.List;
import java.util.Map;

/**
 * trying how simple for declare a list or map<br>
 * Created by zhyhang on 17-3-6.
 */
public class SimpleNewMapList {


    public static void main(String... args) {
        List<String> list = List.of("1", "2");
        Map<String, String> map = Map.of("k1", "val1", "k2", "val2");
        System.out.format("list:%s\n", list.toString());
        System.out.format("map:%s\n", map.toString());
    }


}
