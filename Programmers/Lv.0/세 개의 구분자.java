import java.util.*;

class Solution {
    public String[] solution(String myStr) {
        
        List<String> result = new ArrayList<>();
        String[] myStrArr = myStr.split("");
        String str = "";
        
        for(int i = 0; i < myStrArr.length; i++) {
            if(!myStrArr[i].equals("a") && !myStrArr[i].equals("b") && !myStrArr[i].equals("c")) {
                str += myStrArr[i];
            } else if(!str.equals("")) {
                result.add(str);
                str = "";
            }
        }
        
        if(!str.equals("")) result.add(str);
        if(result.size() == 0) result.add("EMPTY");
        
        return result.stream().toArray(String[]::new);
        
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/181862
