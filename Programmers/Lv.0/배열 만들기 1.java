class Solution {
    public int[] solution(int n, int k) {
        
        int[] result = new int[(int)Math.floor(n/k)];
        int j = 0;
        
        for(int i = 1; i <= n; i++) {
            if(i % k == 0) {
                result[j++] = i;
            }
        }
        
        return result;
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/181901
