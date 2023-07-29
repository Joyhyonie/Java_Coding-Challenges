import java.util.*;

class Solution {
    public int[] solution(int start, int end) {
        
        List<Integer> numList = new ArrayList<>();
        
        for (int i = start; i <= end; i++) {
            numList.add(i);
        }
        
        int[] numArr = numList.stream().mapToInt(Integer::intValue).toArray();
        
        return numArr;
        
    }
}

/* IntStream.rangeClosed() 활용 */
import java.util.stream.IntStream;

class Solution {
    public int[] solution(int start, int end) {
        return IntStream.rangeClosed(start, end).toArray();
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/181920

