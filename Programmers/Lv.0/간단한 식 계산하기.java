class Solution {
    public int solution(String binomial) {
        
        String[] strArr = binomial.split(" ");
        String op = strArr[1];
        int a = Integer.parseInt(strArr[0]);
        int b = Integer.parseInt(strArr[2]);
        
        return op.equals("+") ? a + b : op.equals("-") ? a - b : a * b;
        
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/181865
