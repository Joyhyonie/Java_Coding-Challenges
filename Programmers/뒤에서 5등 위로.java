import java.util.Arrays;

class Solution {
    public int[] solution(int[] numList) {
        
        Arrays.sort(numList);
        
        return Arrays.copyOfRange(numList, 5, numList.length);
        
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/181852
