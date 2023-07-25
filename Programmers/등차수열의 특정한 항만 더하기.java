class Solution {
    public int solution(int a, int d, boolean[] included) {
        
        int answer = 0;
        int i = 0;
        
        for(boolean b : included) {
            if(b == true) {
                if(i == 0) {
                    answer += a;
                } else {
                    answer += a + (d * i);
                }
            }
            i++;
        }
        
        return answer;
    }
}

/* 등차수열인 점을 기억하고, 반복문을 통해 'a += d'와 같이 공차를 초항에 계속 축적하여 ture일 경우에만 축적된 a를 answer에 저장 */
class Solution {

    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        for (int i = 0; i < included.length; i++) {
            if (included[i]) {
                answer += a;
            }
            a += d;
        }
        return answer;
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/181931
