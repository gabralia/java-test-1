package cn.school.thoughtworks.section1;

import java.util.List;
import java.util.stream.Collectors;

public class PracticeB {
    List<String> collectSameElements(List<String> collection1, List<List<String>> collection2) {
        //实现练习要求，并改写该行代码。
        return collection1.stream()
                .filter(t-> collection2.stream().anyMatch(sub-> sub.contains(t)))
                .collect(Collectors.toList());
    }
}
