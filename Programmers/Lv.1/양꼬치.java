class Solution {
    public int solution(int n, int k) {

        k = n/10 > 0 ? k - n/10 : k;
        
        return 12000 * n + 2000 * k;
        
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/120830
