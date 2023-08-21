import java.util.*;

class Solution {
    public int[] solution(int[] numArray, int n) {
        
        List<Integer> numList = new ArrayList<>();
        
        for(int i = 0; i < numArray.length; i++) {
            if(i % n == 0){
                numList.add(numArray[i]);
            }
        }
        
        return numList.stream().mapToInt(Integer::intValue).toArray();
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/181888
