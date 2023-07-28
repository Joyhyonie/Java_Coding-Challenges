import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list) {
        
        int length = num_list.length;
        int[] new_list = Arrays.copyOf(num_list, length + 1);
        
        for(int i = 0; i < length; i++) {
            if(num_list[length - 1] > num_list[length - 2]) {
                new_list[length] = num_list[length - 1] - num_list[length - 2];
            } else {
                new_list[length] = num_list[length - 1] * 2;
            }
        }
        
        return new_list;
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/181927
