class Solution {
    public int[] solution(int n, int k) {
        int[] answer = {};
        int num = n/k;
        int[] temp = new int[num];
        
        int i=0;
        int m = 0;
        int w = 1;
        
        for(i=0; n>=w*k;i++, w++){
            m = w*k;
            temp[i] = m;
        }
        answer = temp;
        return answer;
    }
}
