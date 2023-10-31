class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = {};
        int[] temp = new int[numbers.length];
        // 임시로 저장할 int 배열 생성 
        
        int k = numbers.length;
        int i = 0;
        int j = 0;
        
        for(i=0;i<k;i++,j++){
            
            temp[j] = numbers[i]*2;
        }
        
        answer = temp;
        
        return answer;
    }
}
