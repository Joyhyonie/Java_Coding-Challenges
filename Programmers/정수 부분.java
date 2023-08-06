class Solution {
    public int solution(double flo) {
        
        return (int)Math.floor(flo);
        
    }
}

/* double은 int로 강제 형변환 시, 자동으로 소수점 제외 */
class Solution {
    public int solution(double flo) {
        return (int) flo;
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/181850
