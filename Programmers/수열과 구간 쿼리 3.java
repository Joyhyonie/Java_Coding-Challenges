class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        
        for(int[] query : queries) {
            int i = query[0];
            int j = query[1];
            int temp = arr[i];  // arr[j]에 넣을 arr[i] 복사
            arr[i] = arr[j];    // arr의 j번째 값을 arr[i]로 변경
            arr[j] = temp;      // 복사해둔 i번째 값을 arr[j]로 변경
        }
        
        return arr;
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/181924
