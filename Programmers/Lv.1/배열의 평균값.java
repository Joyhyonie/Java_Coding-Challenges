class Solution {
    public double solution(int[] numbers) {
        
        int sum = 0;
        
        for(int i : numbers) {
            sum += i;
        }
        
        return (double)sum/numbers.length;
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/120817
