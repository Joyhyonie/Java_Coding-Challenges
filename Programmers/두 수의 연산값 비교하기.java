class Solution {
    public int solution(int a, int b) {
        
        int sumAb = Integer.parseInt("" + a + b);
        int mulAb = 2 * a * b;
        
        return sumAb > mulAb ? sumAb : sumAb == mulAb ? sumAb : mulAb;
    }
}

/* Math.max() 활용 가능 */
class Solution {
    public int solution(int a, int b) {
        return Math.max(Integer.parseInt(String.valueOf(a)+String.valueOf(b)),2*a*b);
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/181938
