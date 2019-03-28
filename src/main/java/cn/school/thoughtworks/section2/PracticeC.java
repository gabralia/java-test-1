package cn.school.thoughtworks.section2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeC {
    Map<String, Integer> countSameElements(List<String> collection1) {
        Map<String,Integer> map = new HashMap<>();
        for(int i=0;i<collection1.size();i++){
            String str = collection1.get(i);
            Integer times = 1 ;
            Integer end =  str.length();
            if(str.indexOf('-')>0 || str.indexOf(':')>0){
                end = str.indexOf('-')>0 ?  str.indexOf('-') : str.indexOf(':');
                times = Integer.parseInt(collection1.get(i).substring(end+1));
            }else if(str.indexOf('[') > 0){
                end = str.indexOf('[');
                times = Integer.parseInt(collection1.get(i).substring(end+1,str.indexOf(']')));
            }
            String subStr = collection1.get(i).substring(0,end);
            if(!map.containsKey(subStr)){
                map.put(subStr,times);
            }else {
                map.put(subStr,map.get(subStr)+times);
            }
        }
        return map;
    }
}
