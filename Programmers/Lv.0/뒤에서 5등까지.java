import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list) {
        
        int[] result = new int[5];
        Arrays.sort(num_list);
        
        for(int i = 0; i < result.length; i++) {
            result[i] = num_list[i];
        }
        
        return result;
    }
}

/* Arrays.copyOfRange() 활용 */
import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list) {
      
        Arrays.sort(num_list);

        return Arrays.copyOfRange(num_list, 0, 5);
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/181853
