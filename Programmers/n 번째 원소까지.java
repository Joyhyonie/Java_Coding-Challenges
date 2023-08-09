import java.util.*;

class Solution {
    public int[] solution(int[] numArray, int n) {
        
        List<Integer> numList = new ArrayList<>();
        
        for(int i = 0; i < n; i++){
            numList.add(numArray[i]);
        }
        
        return numList.stream().mapToInt(Integer::intValue).toArray();
        
    }
}

/* Arrays.copyOfRange() 활용 */
import java.util.*;

class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = {};

        answer = Arrays.copyOfRange(num_list,0,n); // num_list의 0번째부터 n번째 인덱스까지를 Array로 생성

        return answer;
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/181889
