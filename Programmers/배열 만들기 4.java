import java.util.*; 

class Solution {
    public int[] solution(int[] arr) {
        
        List<Integer> stkList = new ArrayList<>();
        int i = 0;
        
        while(i < arr.length) {
            if(stkList.size() == 0) {
                stkList.add(arr[i]);
                i++;
            } else if(stkList.size() != 0 && stkList.get(stkList.size() - 1) < arr[i]) {
                stkList.add(arr[i]);
                i++;
            } else if(stkList.size() != 0 && stkList.get(stkList.size() - 1) >= arr[i]) {
                stkList.remove(stkList.size() - 1);
            }
        }
        
        int[] stkArray = stkList.stream().mapToInt(Integer::intValue).toArray();
        
        return stkArray;
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/181918
