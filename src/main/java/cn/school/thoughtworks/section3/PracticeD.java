package cn.school.thoughtworks.section3;

import java.util.List;
import java.util.Map;

public class PracticeD {
    Map<String,Integer> createUpdatedCollection(List<String> collectionA, Map<String,List<String>> object) {
        //实现练习要求，并改写该行代码。
        cn.school.thoughtworks.section2.PracticeB b2 = new cn.school.thoughtworks.section2.PracticeB();
        Map<String,Integer> mapA = b2.countSameElements(collectionA);
        cn.school.thoughtworks.section3.PracticeB b3 = new cn.school.thoughtworks.section3.PracticeB();
        Map<String,Integer> map = b3.createUpdatedCollection(mapA,object);
        return map;
    }
}
