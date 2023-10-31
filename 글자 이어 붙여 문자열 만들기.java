class Solution {
    public String solution(String my_string, int[] index_list) {
        
        int k = index_list.length;
        String[] array = my_string.split("");
        int temp =0;
        int i = 0;
        String sum = "";
        
        for(i=0; i<k; i++){
            temp = index_list[i];
 //           int n = array[temp];
 //           String str = Integer.toString(n);
 //           sum = sum + str;
              sum = sum + array[temp];
        }
        
        String answer = sum;
        return answer;
    }
}
