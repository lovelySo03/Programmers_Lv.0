class Solution {
    public int[] solution(String[] strlist) {
        int[] answer = {};
        int[] temp = new int[strlist.length];
        
        int k = strlist.length;
        int i = 0;
        int j = 0;
        
        for(i=0, j=0 ;i<k;i++, j++){
            
            temp[i] = strlist[i].length();
        }
        
        answer = temp;
        
        return answer;
    }
}
