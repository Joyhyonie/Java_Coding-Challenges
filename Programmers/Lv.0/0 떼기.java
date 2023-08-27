class Solution {
    public String solution(String n_str) {
        
        String[] strArr = n_str.split("");
        String result = "";
        
        int i = 0;
        
        while(strArr[i].equals("0")) {
            strArr[i] = "";
            i++;
        }
        
        for(String s : strArr) {
            result += s;
        }
        
        return result;
        
    }
}

/* "" + Integer.parseInt() 활용 */
class Solution {
    public String solution(String n_str) {
        return "" + Integer.parseInt(n_str);
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/181847
