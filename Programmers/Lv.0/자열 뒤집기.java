class Solution {
    public String solution(String my_string, int s, int e) {
        
        StringBuffer middle = new StringBuffer(my_string.substring(s, e+1));
        middle.reverse();
        
        return my_string.substring(0, s) + middle.toString() + my_string.substring(e+1); 
        
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/181905
