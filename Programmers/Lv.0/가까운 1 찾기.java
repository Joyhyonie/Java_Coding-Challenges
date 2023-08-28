class Solution {
    public int solution(int[] arr, int idx) {
        
        for(int i = 0; i < arr.length; i++) {
            if(idx <= i && arr[i] == 1) {
                return i;
            }
        }
        
        return -1;
        
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/181898
