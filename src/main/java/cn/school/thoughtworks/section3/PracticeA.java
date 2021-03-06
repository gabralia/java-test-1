package cn.school.thoughtworks.section3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeA {
    Map<String,Integer> createUpdatedCollection(Map<String,Integer> collectionA, Map<String,List<String>> object) {
        //实现练习要求，并改写该行代码。

        Map<String,Integer> map = new HashMap<>();
        for(String key : collectionA.keySet()) {
            Integer number = collectionA.get(key);
            for (String subKey : object.keySet()){
                List<String> list = object.get(subKey);
                if(list.contains(key)){
                    map.put(key,number-1);
                }else {
                    map.put(key,number);
                }
            }
        }
        return map;
    }
}
