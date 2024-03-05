public class test1 {
    public static void main(String[] args){
        //         ### **문제 설명**

        // 문자열 `my_string`, `overwrite_string`과 정수 `s`가 주어집니다. 
        // 문자열 `my_string`의 인덱스 `s`부터 `overwrite_string`의 길이만큼을 문자열 `overwrite_string`으로 바꾼 문자열을 return 하는 solution 함수를 작성해 주세요.

        //my_string와 overwrite_string은 숫자와 알파벳으로 이루어져 있습니다.
        //1 ≤ overwrite_string의 길이 ≤ my_string의 길이 ≤ 1,000
        //0 ≤ s ≤ my_string의 길이 - overwrite_string의 길이

    }

    class Solution {
        public String solution(String my_string, String overwrite_string, int s) {
            String answer = "";
            
            String test = my_string.substring(0,s);
                String test2 = my_string.substring(s+overwrite_string.length());
                answer = test+overwrite_string+test2;
            
            return answer;
        }
    }
}