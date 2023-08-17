class Solution {
    public int[] solution(int start, int end) {
        
        int length = start - end + 1;
        int[] result = new int[length];
        
        for(int i = 0; i < length; i++) {
            result[i] = start - i;
        }
        
        return result;
        
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/181899
