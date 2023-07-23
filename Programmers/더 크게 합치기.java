class Solution {
    public int solution(int a, int b) {
        
        int answer = 0;
        String strAb = Integer.toString(a) + Integer.toString(b);
        String strBa = Integer.toString(b) + Integer.toString(a);
        int intAb = Integer.parseInt(strAb);
        int intBa = Integer.parseInt(strBa);
        
        if(intAb > intBa || intAb == intBa) {
            answer = intAb;
        } else {
            answer = intBa;
        }
        
        return answer;
    }
}

/* Math.max 및 int에 ""를 더하는 방법으로 훨씬 간략히 코드 작성 가능 */
class Solution {
    public int solution(int a, int b) {
        return Math.max(Integer.parseInt(a + "" + b), Integer.parseInt(b + "" + a));
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/181939
