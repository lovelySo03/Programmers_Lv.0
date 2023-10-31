class Solution {
    public int solution(int[] num_list) {
        
        int i = 0;
        int k = num_list.length;
        
        String sum_1 = "";
        String sum_2 = "";
        
        for(i=0; i<k ;i++){
           if(num_list[i]%2==0){
               int n1 = num_list[i];
               String str1 = Integer.toString(n1);
               sum_1 = sum_1 + str1;
           } 
            else if(num_list[i]%2==1){
               int n2 = num_list[i];
               String str2 = Integer.toString(n2);
               sum_2 = sum_2 + str2;
            }
        }
            
        int v1 = Integer.parseInt(sum_1);
        int v2 = Integer.parseInt(sum_2);
        
        int answer = v1+v2;
        return answer;
    }
}
