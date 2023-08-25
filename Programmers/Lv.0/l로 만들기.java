class Solution {
    public String solution(String myString) {
        
        char[] charArr = myString.toCharArray();   
        StringBuilder result = new StringBuilder();
        
        for(char c : charArr) {
            result.append((int) c < (int) 'l' ? "l" : c);
        }
        
        return result.toString();
        
    }
}

/* replaceAll()& 정규식 활용 */
class Solution {
    public String solution(String myString) {
        return myString.replaceAll("[^l-z]", "l");
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/181834
