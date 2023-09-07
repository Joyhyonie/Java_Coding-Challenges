class Solution {
    public String solution(int q, int r, String code) {
        
        char[] charArr = code.toCharArray();
        String result = "";
        
        for(int i = 0; i < charArr.length; i++) {
            if(i % q == r) {
                result += charArr[i];
            }
        }
        
        return result;
        
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/181903
