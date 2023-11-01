import java.util.*;
// import java.util.ArrayList를 포함한 것 

class Solution {
    public int[] solution(int l, int r) {
        // 시작값 l, 마지막 값r을 입력받는다 
        List<Integer> list = new ArrayList<>();
        // ArrayList 객체 생성해주기 
        // 배열을 선언하는 것처럼, List의 Size를 초기화해줄 필요가 없다. 
        // 배열처럼 고정된 크기를 가지는 것이 아니라 
        // 메모리가 허용하는 ArrayList의 크기가 자동으로 변경됨 
        // (동적할당의 중요성)
        
        for(int i = l; i<=r; i++) {
            // for문. 시작이 l, 마지막에 r까지 가면 끝남
            String str = i+"";
            // int인 i를 문자열 타입으로 바꿔줌 
            int count = 0;
            for(int j = 0; j < str.length(); j++) {
                if(str.charAt(j) == 48 || str.charAt(j) == 53) {
            // 아스키코드 사용하기. 만약 각 글자가 5또는 0이면? 이라는 뜻 
                    count ++;
            // 이제 하나하나 체크하기 시작하는데, 받은 숫자가 123이면
            // 1하나, 2하나, 3하나 이런 순서로 체크한다. 
            // 이때 글자의 개수 3글자 를 세기 위해서 count를 사용
            // 왜냐면, 여기서 체크한 개수가 전체 글자수와 같으면
            // 내가 원하는 숫자를 가졌다는 것으로 간중하고 list에 추가하기 위해서
                }
            }
            if(count == str.length()) {
                list.add(i);
            // 위에서 체크한 개수가 전체 글자수와 같기 때문에, 리스트에 추가하기 
            }
        }
        int[] answer = list.stream().mapToInt(i->i).toArray();
        // List<integer>을 int[]으로 바꾸는 코드 
        // 왜냐면, 얘기 원했던 answer의 타입은 int[] 인트 배열이기 때문에
        int[] empty = {-1};
        if(answer.length == 0) return empty;
        // 동적할당으로 받은 데이터에 아무것도 없을때, 이걸 리턴한다
        // (문제에서 요청한 사항)
        return answer;
    }
}
