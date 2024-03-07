public class test2 {

    public static void main(String[] args) {
        // 정수 리스트 num_list가 주어질 때, 마지막 원소가 그전 원소보다 크면 마지막 원소에서 그전 원소를 뺀 값을 마지막 원소가 그전 원소보다 크지 않다면 마지막 원소를 두 배한 값을 추가하여 return하도록 solution 함수를 완성해주세요.
        // - 2 ≤ `num_list`의 길이 ≤ 10
        // - 1 ≤ `num_list`의 원소 ≤ 9

    }

    class Solution {
        public int[] solution(int[] num_list) {
            int number = num_list.length -1;
            int[] answer = {};
            answer = new int[number+2];
            for(int i = 0; i < num_list.length; i++) {
                answer[i] = num_list[i];
            }
            if(num_list[number] > num_list[number-1]){
                answer[number+1] = num_list[number] - num_list[number-1];
            }else {
                answer[number+1] = num_list[number]*2;
            }
            return answer;
        }
    }

}