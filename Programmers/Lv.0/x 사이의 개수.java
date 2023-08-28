import java.util.*;

class Solution {
    public int[] solution(String myString) {
        
        List<Integer> result = new ArrayList<>();
        int count = 0;
        
        for(char c : myString.toCharArray()) {
            if(c != 'x') {
                count++;
            } else {
                result.add(count);
                count = 0;
            }
        }
        result.add(count);
        
        return result.stream().mapToInt(Integer::intValue).toArray();
        
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/181867
