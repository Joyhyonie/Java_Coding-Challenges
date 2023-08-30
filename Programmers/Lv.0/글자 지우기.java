import java.util.Arrays;

class Solution {
    public String solution(String my_string, int[] indices) {
        
        String result = "";
        String[] strArr = my_string.split("");
        Arrays.sort(indices);
        
        int j = 0;
        for(int i = 0; i < strArr.length; i++) {
            if(j < indices.length && i == indices[j]) {
                j++; 
            } else {
                result += strArr[i];
            }
        }
        
        return result;
        
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/181900
