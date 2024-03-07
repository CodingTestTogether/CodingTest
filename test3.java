public class test3 {
    public static void main(String[] args) {
        
        // 정수 `n`과 문자열 `control`이 주어집니다. `control`은 "w", "a", "s", "d"의 4개의 문자로 이루어져 있으며, `control`의 앞에서부터 순서대로 문자에 따라 `n`의 값을 바꿉니다.

        // - "w" : `n`이 1 커집니다.
        // - "s" : `n`이 1 작아집니다.
        // - "d" : `n`이 10 커집니다.
        // - "a" : `n`이 10 작아집니다.

        // 위 규칙에 따라 `n`을 바꿨을 때 가장 마지막에 나오는 `n`의 값을 return 하는 solution 함수를 완성해 주세요.

        // - 100,000 ≤ `n` ≤ 100,000
        // - 1 ≤ `control`의 길이 ≤ 100,000
        // - `control`은 알파벳 소문자 "w", "a", "s", "d"로 이루어진 문자열입니다.
    }

    class Solution {
	    public int solution(int n, String control) {
	        for(int i = 0; i < control.length(); i++){
	            if(control.charAt(i) == 'w') {
	            	n++;
	            }else if(control.charAt(i) == 's') {
	            	n--;
	            }else if(control.charAt(i) == 'd') {
	            	n+=10;
	            }else if(control.charAt(i) == 'a') {
	            	n-=10;
	            }
	        }
	        return n;
	    }
	}

}
