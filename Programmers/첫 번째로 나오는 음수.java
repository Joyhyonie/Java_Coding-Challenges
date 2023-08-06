class Solution {
    public int solution(int[] num_list) {
        
        int result = -1;
        
        for(int i = 0; i < num_list.length; i++) {
            if(num_list[i] < 0) {
                result = i;
                break;
            }
        }
        
        return result;
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/181896
