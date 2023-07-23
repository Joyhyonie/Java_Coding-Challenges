class Solution {
    public String solution(String my_string, int k) {
        
        String answer = "";
        
        for (int i = 0; i < k; i++) {
            answer += my_string;
        }
        
        return answer;
    }
}

/* repeat(), append() 메소드 활용 가능 */
class Solution {
    public String solution(String my_string, int k) {
        return my_string.repeat(k);
    }
}

class Solution {
    public String solution(String my_string, int k) {
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<k; i++) {
            sb.append(my_string);
        }
        return sb.toString();
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/181940
