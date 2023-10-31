class Solution {
    public int[] solution(int[] num_list) {
 
        int[] answer = {};
        // int 배열 변수 선언하기 
        // 아하, 얘는 리스트로 받고 싶구나 
        int[] temp = new int[num_list.length];
        // 임시로 저장할 int 배열 생성 
 
        int k = num_list.length;
        int i = 0;
        int j = 0;
        
        for(i=0, j=k-1 ;i<k;i++, j--){
            
            temp[j] = num_list[i];
        }
        
        answer = temp;
        
        return answer;
    }
}
