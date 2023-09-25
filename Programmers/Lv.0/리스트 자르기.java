import java.util.*;

class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        
        List<Integer> result = new ArrayList<>();
        
        switch(n) {
            case 1: for(int i = 0; i <= slicer[1]; i++) 
                        result.add(num_list[i]); break;
            case 2: for(int i = slicer[0]; i < num_list.length; i++)
                        result.add(num_list[i]); break;
            case 3: for(int i = slicer[0]; i <= slicer[1]; i++)
                        result.add(num_list[i]); break;
            case 4: for(int i = slicer[0]; i <= slicer[1]; i+=slicer[2])
                        result.add(num_list[i]); break;
        }
        
        return result.stream().mapToInt(Integer::intValue).toArray();
        
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/181897
