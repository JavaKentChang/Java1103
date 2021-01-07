
package com.ocp14_collecton_list_map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        
        //思考<String, String >
        Map<String, Integer> map = new LinkedHashMap();//有順序性，如果都不寫=Map<object,object>
        map.put("國",100);
        map.put("英",90);
        map.put("數",100);
        System.out.println(map);
        System.out.println(map.get("英"));//取出英文值
        System.out.println(map.keySet());//取出所有的key值
        System.out.println(map.values());//取出所有的value值
        
        for (String key : map.keySet()) {
            System.out.println(key+" 分數:" + map.get(key));
            
        }
        //Java 8 
        map.entrySet().forEach(e->System.out.println(e.getKey()+""+e.getValue()));
        //計算總分
        int sum = map.entrySet().stream().mapToInt(e->e.getValue()).sum();
        System.out.println(sum);
        
    }
}
