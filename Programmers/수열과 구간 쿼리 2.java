class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        
        int[] result = new int[queries.length];
        
        for(int i = 0; i < queries.length; i++) {
            int s = queries[i][0];
            int e = queries[i][1];
            int k = queries[i][2];
            int min = Integer.MAX_VALUE; // 가장 큰 값으로 할당한 뒤, 이보다 작은 수가 있다면 그 값으로 갱신할 것
            
            for(int j = s; j <= e; j++){
                // min의 값을 계속 갱신 (최소값을 찾기 위해)
                if(arr[j] < min && k < arr[j]) {
                    min = arr[j];
                }
            }
            
            if(min != Integer.MAX_VALUE) {
                // min이 최대값이 아닐 경우, 위 과정에서 최소값으로 갱신이 되었다는 의미이므로 result[i]에 할당
                result[i] = min;
            } else {
                result[i] = -1;
            }
            
        }
        return result;
        
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/181923
