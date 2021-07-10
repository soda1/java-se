package com.soda.stream;

import org.junit.Test;

import java.util.*;

/**
 * @author soda
 * @date 2021/7/6
 */
public class StreamUseDemo {


    @Test
    public void test() {
        List<Map<String, Object>> mapList = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            Map<String, Object> map = new HashMap<>();
            map.put("index", i);
            map.put("num", i);
            map.put("prop", "num");
            mapList.add(map);
        }
        Map<String, Object> map = mapList.stream().findFirst().get();
        System.out.println(map.toString());
        System.out.println(mapList.stream().distinct().count());
        
    }

}
