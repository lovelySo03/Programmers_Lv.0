class Solution {
    public String solution(String[] arr) {
        String answer = "";
        
        int D1 = arr.length;
//        int D2 = str2.length();
        int i = 0;
        
        String A = "";
//        String B = "";
        
        for(i=0; i<D1 ;i++)
            {    
                 A = arr[i];
                 answer = answer+A;
            }
        
        return answer;
    }
}
