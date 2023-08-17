class Solution {
    public String solution(String my_string, int n) {
        
        char[] charArray = my_string.toCharArray();
        
        StringBuilder result = new StringBuilder();
        
        for(int i = 0; i < n; i++) {
            result.append(charArray[i]);
        }
        
        return result.toString();
        
    }
}

/* substring() 활용 */
class Solution {
    public String solution(String my_string, int n) {
        return my_string.substring(0, n);
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/181907
