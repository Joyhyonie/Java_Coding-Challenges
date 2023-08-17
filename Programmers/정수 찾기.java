class Solution {
    public int solution(int[] num_list, int n) {
        
        int result = 0;
        
        for(int num : num_list) {
            if(num == n) {
                result = 1; break;
            }
        }
        
        return result;
    }
}

/* IntStream.of().anyMatch() 활용 */
import java.util.stream.IntStream;

class Solution {
    public int solution(int[] numList, int n) {
        return IntStream.of(numList).anyMatch(num -> num == n) ? 1 : 0;
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/181840
