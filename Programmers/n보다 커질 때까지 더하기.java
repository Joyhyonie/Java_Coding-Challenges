class Solution {
    public int solution(int[] numbers, int n) {

        int result = 0;
        
        for(int num : numbers) {
            result += result <= n ? num : 0;
        }
        
        return result;
        
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/181884
