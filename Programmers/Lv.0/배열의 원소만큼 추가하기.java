import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        
        List<Integer> result = new ArrayList<>();
        
        for(int num : arr) {
            for(int i = 0; i < num; i++) {
                result.add(num);
            }
        }
        
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/181861
