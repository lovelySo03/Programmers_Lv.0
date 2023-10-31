import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();
        
    
        int str_len = str.length();
        
          if((1<= n) && (n <= 5) && (1<=str_len) && (str_len<=10)){
       for(int k=0;k<n;k++){
                System.out.print(str);

          }           
        }      
    }
}
