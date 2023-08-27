import java.util.*;

class Solution {
    public String[] solution(String[] strArr) {
        
        List<String> result = new ArrayList<>();
        
        for(String s : strArr) {
            if(!s.contains("ad")) {
                result.add(s);
            }
        }
        
        return result.stream().toArray(String[]::new);
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/181870
