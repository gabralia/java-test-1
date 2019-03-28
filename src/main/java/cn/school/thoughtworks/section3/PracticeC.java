package cn.school.thoughtworks.section3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import cn.school.thoughtworks.section2.PracticeA;

public class PracticeC {
    Map<String,Integer> createUpdatedCollection(List<String> collectionA, Map<String,List<String>> object) {
        //实现练习要求，并改写该行代码。
        PracticeA a2 = new PracticeA();
        Map<String,Integer> mapA = a2.countSameElements(collectionA);
        PracticeB b3 =new PracticeB();
        Map<String,Integer> map = b3.createUpdatedCollection(mapA,object);
        return map;
    }
}
