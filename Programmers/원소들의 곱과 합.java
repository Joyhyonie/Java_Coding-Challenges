class Solution {
    public int solution(int[] num_list) {
        
        int mul = 1;
        int sum = 0;
        
        for(int num : num_list) {
            mul *= num;
            sum += num;
        }
        
        return mul < sum * sum ? 1 : 0;
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/181929
