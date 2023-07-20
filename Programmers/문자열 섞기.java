class Solution {
    public String solution(String str1, String str2) {
        
        char[] strArr1 = str1.toCharArray();
        char[] strArr2 = str2.toCharArray();
        String answer = "";
        
        for(int i = 0; i < str1.length(); i++) {
            answer += strArr1[i];
            answer += strArr2[i];
        }
        
        return answer;
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/181942
