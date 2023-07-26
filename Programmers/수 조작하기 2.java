class Solution {
    public String solution(int[] numLog) {
        String result = "";

        for (int i = 0; i < numLog.length; i++) {
            // i가 0이거나, 수가 증가했을 때,
            if (i == 0 || numLog[i] > numLog[i-1]) {
                // 1만 증가했다면,
                if (i != 0 && numLog[i-1] == (numLog[i] - 1)) {
                    result += "w";
                // 10이 증가했다면,
                } else if(i != 0 && numLog[i-1] == (numLog[i] - 10)) {
                    result += "d";
                }
            // 수가 감소했을 때,
            } else if (numLog[i] < numLog[i-1]) {
                if (numLog[i-1] == (numLog[i] + 1)) {
                    result += "s";
                } else {
                    result += "a";
                }
            }
        }

        return result;
    }
}

/* Switch문 활용 가능 */
class Solution {
    public String solution(int[] numLog) {
        String answer = "";
        for(int i=1; i<numLog.length; i++){
            int j = numLog[i-1] - numLog[i];
            switch(j){
                case -1 : answer+='w'; break;
                case 1 : answer+='s'; break;
                case -10 : answer+='d'; break;
                case 10 : answer+='a'; break;
            }
        }
        return answer;
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/181925
