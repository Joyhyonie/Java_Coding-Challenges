class Solution {
    public String solution(String[] my_strings, int[][] parts) {
        
        String result = "";
        
        for(int i = 0; i < my_strings.length; i++) {
            result += my_strings[i].substring(parts[i][0], parts[i][1] + 1);
        }
        
        return result;
        
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/181911
