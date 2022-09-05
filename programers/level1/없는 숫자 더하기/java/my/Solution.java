class Solution {
    public int solution(int[] numbers) {
        int sum= 45;
        int answer = -1;
        int total = 0;
        for(int cnt : numbers) {
            total += cnt;
        }
        
        answer = sum - total;
        
        return answer;
    }
}