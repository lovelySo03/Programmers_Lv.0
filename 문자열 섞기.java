class Solution {
    public String solution(String str1, String str2) {
        String answer = "";
        
        int D1 = str1.length();
        int D2 = str2.length();
        int i = 0;
        
        String A = "";
        String B = "";
        
        for(i=0; i<D1 ;i++)
            {    
                 A = str1.substring(i,i+1);
                 B = str2.substring(i,i+1);
                 answer = answer+A+B;
            }
        
        
        return answer;
    }
}
