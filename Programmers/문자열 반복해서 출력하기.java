import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();
        
        for(int i = 0; n > i; i++) {
            System.out.print(str);
        }
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/181950
