class Solution {
    public String solution(String my_string, int[] index_list) {
        
        String[] strArray = my_string.split("");
        StringBuilder result = new StringBuilder();
        
        for(int i = 0; i < index_list.length; i++) {
            result.append(strArray[index_list[i]]);
        }
        
        return result.toString();
        
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/181915
