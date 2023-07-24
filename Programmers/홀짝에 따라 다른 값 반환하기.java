class Solution {
    public int solution(int n) {
        
        int answer = 0;
        
        if(n % 2 != 0) {
            for(int i = 0; i <= n; i++) {
                if(i % 2 != 0) {
                    answer += i;
                }
            }
        } else {
            int s = 0;
            for(int i = 0; i <= n; i++) {
                if(i % 2 == 0){
                    s = i * i;
                    answer += s;
                }
            }
        }
        
        return answer;
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/181935
