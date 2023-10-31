class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        
        int answer = 0;
        
        // String인 ineq에 있는 값이 부호 > 와 같다 
        // String인 ineq의 값이 부호 = 와 같다.
        
        if(ineq.equals(">") && eq.equals("=")){
            if(n>=m){
                answer = 1;
            }
        }
        
        else if(ineq.equals(">") && eq.equals("!")){
            if (n>m){
                answer = 1;
            }
        }
        
        else if(ineq.equals("<") && eq.equals("=")){
            if(n<=m){
                answer = 1;
            }
        }
        else if(ineq.equals("<") && eq.equals("!")){
            if(n<m){
                answer = 1;
            }
        }
        
        return answer;
    }
}
