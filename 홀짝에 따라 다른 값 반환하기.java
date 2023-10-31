class Solution {
    public int solution(int n) {
        int answer = 0;
        
        if (n%2==1){
            //n이하의 홀수인 모든 양의 정수의 합 리턴
            int a = (n/2)+1;
            answer = a*a;
        }
        else{
            // n이하의 짝수인 모든 양의 정수의 제곱의 합을 리턴
            int b = n/2;
            answer = (2)*(2*b*b*b + 3*b*b + b)/3;
        }
        return answer;
    }
}
