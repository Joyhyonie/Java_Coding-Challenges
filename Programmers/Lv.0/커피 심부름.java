class Solution {
    public int solution(String[] order) {
        
        int total = 0;
        
        for(String s : order) {
            total += s.equals("anything") || s.contains("americano") ? 4500 : 5000;
        }
        
        return total;
        
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/181837
