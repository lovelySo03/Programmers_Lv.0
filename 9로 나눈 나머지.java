class Solution {
    public int solution(String number) {
        
        int sum = 0;
        int i = 0;
        String str[] = number.split("");
        for(i=0; i<number.length(); i++){
            sum = sum + Integer.parseInt(str[i]);
        }
        int answer = 0;
        answer = sum%9;
        return answer;
    }
}
