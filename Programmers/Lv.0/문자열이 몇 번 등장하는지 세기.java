class Solution {
    public int solution(String myString, String pat) {
        
        int count = 0;
        
        for(int i = 0; i < myString.length(); i++) {
            count += myString.substring(i).startsWith(pat) ? 1 : 0;
        }
        
        return count;
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/181871
