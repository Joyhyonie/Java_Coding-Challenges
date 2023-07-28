class Solution {
    public int[] solution(int[] arr, int[][] queries) {

        for(int[] query : queries) {
            int s = query[0];
            int e = query[1];
            int k = query[2];
            
            for(int i = s; i < arr.length; i++) {
                if(s <= i && i <= e) {
                    arr[i] += i % k == 0 ? 1 : 0;
                }
            }
            
        }
        
        return arr;
        
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/181922
