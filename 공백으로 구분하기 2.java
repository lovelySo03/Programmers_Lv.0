import java.util.StringTokenizer;

class Solution {
    public String[] solution(String my_string) {
        String[] answer = {};
        int i = 0;
        StringTokenizer st = new StringTokenizer(my_string);

        int count = st.countTokens();
        String[] temp = new String[count];
		    while(st.hasMoreTokens()) {
		        temp[i] = st.nextToken();
                i++;
                
                if(i>=count)
                    break;
            }
        
        answer = temp;
        return answer;
        
        // 바로 answer을 넣으면, IndexOutOfBoundsException 에러가 뜰 수 있기 때문에 
        // temp를 사용해서 먼저 for문을 돌려준 후 
        // 나중에 answer에 temp를 넣어주는 것이 좋다. 
    }
}
