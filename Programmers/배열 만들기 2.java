import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
        
        List<Integer> numList = new ArrayList<>();
        
        // 0과 5로만 이루어진 모든 정수 찾기
        for(int i = l; i <= r; i++) {
            if(i % 5 == 0) {
                String[] strArr = Integer.toString(i).split("");
                boolean contains = true;
                
                for(String s : strArr) {
                    if(!s.equals("0") && !s.equals("5")) {
                        contains = false;
                    } 
                }
                
                if(contains) {
                    numList.add(i);
                }
            }
        }
        
        if(numList.size() == 0) {
            numList.add(-1);
        }
        
        // stream 활용하여 List to Array
        int[] numArr = numList.stream().mapToInt(Integer::intValue).toArray();
        
        return numArr;
        
    }
}

/* Stream & 람다식 활용 */
import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(int l, int r) {
        List<Integer> filtered = IntStream.rangeClosed(l, r)
                .filter(num -> String.valueOf(num).chars().allMatch(ch -> ch == '0' || ch == '5'))
                .boxed()
                .collect(Collectors.toList());
        return filtered.isEmpty() ? new int[] {-1} : filtered.stream().mapToInt(Integer::intValue).toArray();
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/181921
