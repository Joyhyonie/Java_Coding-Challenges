import java.util.*;

class Solution {
    public int[] solution(int n) {
        
        List<Integer> numList = new ArrayList<>();
        numList.add(n);
        
        while(n != 1) {
            if(n % 2 == 0) {
                n = n/2;
                numList.add(n);
            } else {
                n = 3*n+1;
                numList.add(n);
            }
        }
        
        int[] numArray = numList.stream().mapToInt(Integer::intValue).toArray();
        
        return numArray;
        
    }
}

/* Stream.iterate()를 활용 */
import java.util.*;
import java.util.stream.Stream;

class Solution {
    public int[] solution(int n) {
        return Stream.iterate(n, i -> i >= 1, i -> i == 1 ? 0 : i % 2 == 0 ? i / 2 : 3 * i + 1).mapToInt(Integer::intValue).toArray();
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/181919
