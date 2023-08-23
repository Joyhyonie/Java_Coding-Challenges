class Solution {
    public int solution(String myString, String pat) {
        
        myString = myString.replace("A", "temp");
        myString = myString.replace("B", "A");
        myString = myString.replace("temp", "B");

        return myString.contains(pat) ? 1 : 0;
        
    }
}

/* 메소드 체이닝 */
class Solution {
    public int solution(String myString, String pat) {
        myString = myString.replace("A", "a").replace("B", "A").replace("a", "B");
        return myString.contains(pat) ? 1 : 0;
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/181864
