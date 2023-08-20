class Solution {
    public int[] solution(int[] arr, int k) {
        
        int[] result = new int[arr.length];
        int i = 0;

        if(k % 2 == 1) {
            for(int a : arr)
                result[i++] = a*k;
        } else {
            for(int a : arr) 
                result[i++] = a+k;
        }
        
        return result;
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/181835
