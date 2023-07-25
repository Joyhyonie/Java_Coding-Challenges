class Solution {
    public int solution(int[] num_list) {
        
        String oddStr = "";
        String evenStr = "";
        
        for(int num : num_list) {
            if(num % 2 == 0) {
                evenStr += Integer.toString(num);
            } else {
                oddStr += Integer.toString(num);
            }
        }
        
        return Integer.parseInt(evenStr) + Integer.parseInt(oddStr);
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/181928
