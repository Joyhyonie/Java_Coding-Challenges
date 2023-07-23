class Solution {
    public String solution(String[] arr) {
        
        String answer = "";
        
        for (String s : arr) {
            answer += s;
        }
        
        return answer;
    }
}

/* join() 메소드를 활용하여 배열 요소들을 순서대로 String으로 변환도 가능 */
// class Solution {
//    public String solution(String[] arr) {
//       return String.join("", arr);
//    }
// }

// https://school.programmers.co.kr/learn/courses/30/lessons/181941
