import java.util.*;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        
        List<Integer> result = new ArrayList<>();
        
        for(String str : intStrs) {
            String piece = str.substring(s, s+l);
            int num = Integer.parseInt(piece);
            if(num > k) {
                result.add(num);
            }
        }
        
        return result.stream().mapToInt(Integer::intValue).toArray();
        
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/181912
