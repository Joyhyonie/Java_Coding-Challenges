import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        
        List<Integer> result = new ArrayList<>();
        
        for(int i = 0; i < arr.length; i++) {
            boolean add = true;
            
            for(int j = 0; j < delete_list.length; j++) {
                if(arr[i] == delete_list[j]) {
                    add = false;
                } 
            } 
            
            if(add) {
                result.add(arr[i]);
            }
            
        }
        
        return result.stream().mapToInt(Integer::intValue).toArray();
        
    }
}

/* IntStream.of().filter().toArray() 활용 */
import java.util.stream.IntStream;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        return IntStream.of(arr).filter(i -> !IntStream.of(delete_list).anyMatch(s -> s == i)).toArray();
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/181844
