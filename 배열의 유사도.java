class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        
        int a = s1.length;
        int b = s2.length;        
        int sum = 0;
        
        for(int i=0; i<a; i++){
            for(int j=0; j<b; j++){
            
                if(s1[i].equals(s2[j])){
                    sum = sum + 1; 
                }
                
           }
        }
        answer = sum;
        return answer;
    }
}
