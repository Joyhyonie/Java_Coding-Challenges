class Solution {
    public int solution(int[] date1, int[] date2) {
        
        String str1 = "";
        String str2 = "";
        
        for(int i = 0; i < date1.length; i++) {
            str1 += date1[i] + "";
            str2 += date2[i] + "";
        }
        
        return Integer.parseInt(str1) < Integer.parseInt(str2) ? 1 : 0;
        
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/181838
