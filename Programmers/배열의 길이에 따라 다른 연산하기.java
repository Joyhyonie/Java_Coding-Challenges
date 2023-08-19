class Solution {
    public int[] solution(int[] arr, int n) {
        
        if(arr.length % 2 == 1) {
            for(int i = 0; i < arr.length; i++) {
                arr[i] += i % 2 == 0 ? n : 0;
            }
        } else {
            for(int i = 0; i < arr.length; i++){
                arr[i] += i % 2 == 1 ? n : 0;
            }
        }
        
        return arr;
        
    }
}

/* IntStream.map().toArray() 활용 */
import java.util.stream.IntStream;

class Solution {
    public int[] solution(int[] arr, int n) {
        return IntStream.range(0, arr.length).map(i -> arr[i] + (i % 2 == (arr.length % 2 == 0 ? 1 : 0) ? n : 0)).toArray();
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/181854
