class Solution {
    public int[] solution(int[] num_list) {
        
        int odd = 0, even = 0;
        
        for(int i : num_list) {
            if(i%2==0) {
                even++;
            } else {
                odd++;
            }
        }
        
        int[] result = {even, odd};
        
        return result;
        
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/120824
