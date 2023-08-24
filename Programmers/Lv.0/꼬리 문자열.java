class Solution {
    public String solution(String[] str_list, String ex) {
        
        String result = "";
        
        for(String s : str_list) {
            result += s.contains(ex) ? "" : s;
        }
        
        return result;
        
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/181841
