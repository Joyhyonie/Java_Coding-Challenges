class Solution {
    public String[] solution(String[] strArr) {
        
        for(int i = 0; i < strArr.length; i++){
            strArr[i] = i % 2 == 1 ? strArr[i].toUpperCase() : strArr[i].toLowerCase();
        }
        
        return strArr;
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/181875
