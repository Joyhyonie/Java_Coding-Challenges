class Solution {
    public int solution(String s) {
        
        String[] strArr = s.split(" ");
        int result = 0;
        
        for(int i = 0; i < strArr.length; i++) {
            if(!strArr[i].equals("Z")) {
                result += Integer.parseInt(strArr[i]);
            } else {
                result -= Integer.parseInt(strArr[i-1]);
            }
        }
        
        return result;
        
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/120853
