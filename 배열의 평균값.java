class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        int k = numbers.length;
        int m = 0;
        int i = 0;
        
        for(i=0;i<k;i++){
            m = m + numbers[i]; 
        }
        
        answer = (double)m/k;
        // 오른쪽에 (double)을 붙여줘야함. 그래야 오른쪽이 더블로 바뀜. 
        // 왼쪽은 원래 더블임 
        
        return answer;
    }
}
