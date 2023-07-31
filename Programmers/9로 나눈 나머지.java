class Solution {
    public int solution(String number) {
        
        String[] strArray = number.split("");
        int sum = 0;
        
        for(String s : strArray) {
            int i = Integer.parseInt(s);
            sum += i;
        }
        
        return sum % 9;
        
    }
}

/* Arrays.stream() 활용 */
import java.util.Arrays;
class Solution {
    public int solution(String number) {
        return Arrays.stream(number.split("")).mapToInt(Integer::parseInt).sum()%9;
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/181914
