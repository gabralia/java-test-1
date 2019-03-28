package cn.school.thoughtworks.section2;


import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PracticeA {
    public Map<String,Integer> countSameElements(List<String> collection1) {
//        java8方法
//        return  collection1.stream().collect(Collectors.groupingBy(p -> p,Collectors.counting()));

//        普通方法
        Map<String,Integer> map = new HashMap<>();
        for(int i=0;i<collection1.size();i++){
            if(!map.containsKey(collection1.get(i))){
                map.put(collection1.get(i),1);
            }else {
                map.put(collection1.get(i),map.get(collection1.get(i))+1);
            }
        }
        return map;
    }
}
