class Solution {
    public String solution(String myString, String pat) {

        String[] strArr = myString.split("");
        String str = "";
        String result = "";
        
        for(int i = 0; i < strArr.length; i++) {
            str += strArr[i];
            if(str.endsWith(pat)) result = str;
        }
        
        return result;
        
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/181872
