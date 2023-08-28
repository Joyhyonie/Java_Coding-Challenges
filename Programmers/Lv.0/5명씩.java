class Solution {
    public String[] solution(String[] names) {
        
        int resultLength = (int) Math.ceil((double) names.length / 5);
        String[] result = new String[resultLength];
        
        int j = 0;
        for(int i = 0; i < names.length; i++) {
            if(i == 0 || i % 5 == 0) {
                result[j++] = names[i];
            }
        }
        
        return result;
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/181886
