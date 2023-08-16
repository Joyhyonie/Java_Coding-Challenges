class Solution {
    public String solution(String rny_string) {
        
        return rny_string.contains("m") ? rny_string.replace("m", "rn") : rny_string;
    }
}

/* replace() / replaceAll() 메소드만 활용한 방법 */
class Solution {
    public String solution(String rny_string) {
        return rny_string.replace("m", "rn");
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/181863
