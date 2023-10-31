import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        Turn turn = new Turn();
        turn.arr = turn.changeToArr(a);
        turn.printCharArr(turn.arr);
    }
}

class Turn{
    char[] arr;
    public char[] changeToArr(String a){
        char[] result = a.toCharArray();
        return result;
    }
    
    public void printCharArr(char[] a){
        for(int i = 0; i< a.length; i++){
            System.out.println(a[i]);
        }
    }
    
}
