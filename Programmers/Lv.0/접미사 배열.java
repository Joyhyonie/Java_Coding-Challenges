import java.util.Arrays;

class Solution {
    public String[] solution(String my_string) {
        
        String[] strArr = my_string.split("");
        String[] result = new String[my_string.length()];
        
        for(int i = 0; i < strArr.length; i++) {
            result[i] = my_string.substring(i, strArr.length);                     
        }
        
        Arrays.sort(result);
        
        return result;
        
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/181909
