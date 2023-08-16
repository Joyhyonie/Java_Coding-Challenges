class Solution {
    public int solution(int[] num_list) {
        
        int result = num_list.length >= 11 ? 0 : 1;
        
        if(num_list.length >= 11) {
            
            for(int num : num_list) {
                result += num;
            }
            
        } else {

            for(int num : num_list) {
                result *= num;
            }
        }
        
        return result;

    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/181879
