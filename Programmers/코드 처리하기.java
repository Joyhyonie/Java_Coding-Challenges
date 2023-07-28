class Solution {
    public String solution(String code) {
        
        String ret = "";
        int mode = 0;
        String[] codeArr = code.split("");
        
        for(int i = 0; i < codeArr.length; i++) {
            if(mode == 0){
                if(!codeArr[i].equals("1")) {
                    ret += i % 2 == 0 ? codeArr[i] : "";
                } else {
                    mode = 1;
                }
            } else {
                if(!codeArr[i].equals("1")) {
                    ret += i % 2 != 0 ? codeArr[i] : "";
                } else {
                    mode = 0;
                }
            }
        }
        
        if(ret.equals("")) {
            ret = "EMPTY";
        }
        
        return ret;
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/181932
