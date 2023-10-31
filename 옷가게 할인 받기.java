class Solution {
    public int solution(int price) {
        
        int sum = 0;
        
        if(price>=100000 && price<300000){
            sum = price*95/100;
        }
        
        else if(price>=300000 && price<500000){
            sum = price*90/100;
        }
        
        else if(price>=500000){
            sum = price*80/100;
        }
        
        else{
            sum = price;
        }
        
        
        int answer = sum;
        return answer;
    }
}
