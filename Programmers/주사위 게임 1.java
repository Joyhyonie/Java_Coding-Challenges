class Solution {
    public int solution(int a, int b) {
        
        int answer = 0;
        
        if(a%2==1 && b%2==1) {
            answer = a*a + b*b;
        } else if((a+b) % 2 == 1) {
            answer = (a+b) * 2;
        } else if(a%2==0 && b%2==0) {
            answer = Math.abs(a - b);
        }
        
        return answer;
        
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/181839
