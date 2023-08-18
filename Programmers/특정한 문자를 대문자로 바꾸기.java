class Solution {
    public String solution(String my_string, String alp) {
        
        String[] strArray = my_string.split("");
        StringBuilder result = new StringBuilder();
        
        for(String s : strArray) {
            if(s.equals(alp)) {
                s = s.toUpperCase();
            }
            result.append(s);
        }
        
        return result.toString();
        
    }
}

/* replace() 활용 */
class Solution {
    public String solution(String my_string, String alp) {
        String answer = my_string.replace(alp, alp.toUpperCase());
        return answer;
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/181873
