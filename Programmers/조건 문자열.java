class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        
        if(eq.equals("=")) {
            if(ineq.equals(">")) {
                return n >= m ? 1 : 0;
            } else {
                return n <= m ? 1 : 0;
            }
        } else {
            if(ineq.equals(">")) {
                return n > m ? 1 : 0;
            } else {
                return n < m ? 1 : 0;
            }
        }
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/181934
