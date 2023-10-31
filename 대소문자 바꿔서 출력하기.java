import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
//      System.out.println(a);
        
        String answer = "";
        for(char x : a.toCharArray()){
            
            if(Character.isLowerCase(x)){//소문자라면
                answer += Character.toUpperCase(x);
            } 
            else {//대문자라면
                answer += Character.toLowerCase(x);
            }
        }
        System.out.println(answer);
    }
}
