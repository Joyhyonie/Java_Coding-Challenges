class Solution {
    public int solution(int n) {
        
        int result = 0;
        
        for(int i = 0; i <= n; i++) {
            result += i % 2 == 0 ? i : 0;
        }
        
        return result;
        
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/120831
