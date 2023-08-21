import java.util.*;

class Solution {
    public String[] solution(String my_string) {

        String[] splited = my_string.split(" ");
        List<String> strList = new ArrayList<>();
        
        for(String s : splited) {
            if(!s.equals("")) {
                strList.add(s);
            }
        }
        
        String[] strArray = strList.toArray(new String[strList.size()]);
        
        return strArray;
        
    }
}

/* Arrays.stream().filter().toArray() 활용 */
import java.util.*;

class Solution {
    public String[] solution(String my_string) {

        return Arrays.stream(my_string.split(" "))
                     .filter(s -> s.length() > 0)
                     .toArray(String[]::new);
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/181868
