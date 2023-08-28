import java.util.*;

class Solution {
    public String[] solution(String myString) {
        
        List<String> result = new ArrayList<>();
        String[] strArr = myString.split("x");
        Arrays.sort(strArr);
        
        for(String s : strArr) {
            if(!s.equals("")) {
                result.add(s);
            }
        }
        
        return result.stream().toArray(String[]::new);
        
    }
}

/* Arrays.stream().sorted().toArray() 활용 */
import java.util.*;

class Solution {
    public String[] solution(String myString) {
        return Arrays.stream(myString.split("x")).filter(s -> !s.isEmpty()).sorted().toArray(String[]::new);
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/181866
