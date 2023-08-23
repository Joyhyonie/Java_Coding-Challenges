class Solution {
    public int solution(String my_string, String is_suffix) {
        
        if(my_string.length() >= is_suffix.length()) {
            return my_string.substring(my_string.length() - is_suffix.length()).contains(is_suffix) ? 1 : 0;
        } else {
            return 0;
        }
        
    }
}

/* endsWith() 활용 */
class Solution {
    public int solution(String myString, String isSuffix) {
        return myString.endsWith(isSuffix) ? 1 : 0;
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/181908
