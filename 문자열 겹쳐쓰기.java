class Solution {
    public String solution(String my_string, String overwrite_string, int s) {

//        String answer = my_string;

        int D1 = my_string.length(); //my_string_length 
        int D2 = overwrite_string.length(); //overwrite_string_length
//        System.out.println(D1);
//        System.out.println(D2);
        
        String A = my_string.substring(0,s);
        String B = my_string.substring(s+D2);
        String C = overwrite_string;
            
        String answer = A+C+B;
        
        System.out.println(answer);
        
        
        
        /*
        for(int i=0; i<D2; i++){
            
            int k = i+s;
            answer.charAt(k) = overwrite_string.charAt(i);  
        }
        */
        
        return answer;
    }
}
