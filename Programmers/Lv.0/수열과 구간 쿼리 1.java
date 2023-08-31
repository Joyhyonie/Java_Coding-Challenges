class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < queries.length; j++) {
                if(queries[j][0] <= i && i <= queries[j][1]) {
                    arr[i] += 1;
                }
            }
        }
        
        return arr;
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/181883
