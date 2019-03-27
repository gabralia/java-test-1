package cn.school.thoughtworks.section1;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PracticeC {
    List<String> collectSameElements(List<String> collection1, Map<String,List<String>> collection2) {
        //实现练习要求，并改写该行代码。
        return collection1.stream()
                .filter(t-> {
                    Boolean containItem = false;
                    for(String key : collection2.keySet()) {
                        List<String> list =collection2.get(key);
                        containItem = list.contains(t);
                    }
                    return containItem;
                })
                .collect(Collectors.toList());
    }
}
