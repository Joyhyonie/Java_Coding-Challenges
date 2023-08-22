class Solution {
    public int solution(String num_str) {
       
        String[] strArray = num_str.split("");
        int sum = 0;
        
        for(String s : strArray) {
            sum += Integer.parseInt(s);
        }
        
        return sum;
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/181849
