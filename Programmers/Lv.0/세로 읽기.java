class Solution {
    public String solution(String my_string, int m, int c) {
        
        String[] strArr = my_string.split("");
        String result = "";
        
        for(int i = c - 1; i < strArr.length; i += m) {
            result += strArr[i];
        }
        
        return result;
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/181904
