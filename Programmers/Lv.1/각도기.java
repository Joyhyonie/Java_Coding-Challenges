class Solution {
    public int solution(int angle) {
        return angle < 90 ? 1 : angle == 90 ? 2 : angle == 180 ? 4 : 3;
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/120829
