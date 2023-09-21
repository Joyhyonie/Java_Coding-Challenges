class Solution {
    public int[] solution(int[] num_list) {

        int[] result = new int[num_list.length];
        int j = 0;
        
        // 거꾸로 돌며 삽입
        for(int i = result.length-1; i >= 0; i--) {
            result[j++] = num_list[i];
        }
        
        return result;
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/120821
