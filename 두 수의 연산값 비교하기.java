class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        String A;
        String B;
        
        A = Integer.toString(a);
        B = Integer.toString(b);
        // 정수를 문자열로 저장 
        
        int case1 = Integer.parseInt(A+B);
        // 문자열을 int 정수로 변환
        
        int case2 = 2*a*b;        
         
        if (case1>=case2){
            answer = case1;
        }
        else{
            answer = case2;
        }
        return answer;
    }
}
