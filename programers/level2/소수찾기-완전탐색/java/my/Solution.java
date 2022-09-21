import java.util.*;

class Solution {
	private static int answer = 0;
	private static ArrayList<Integer> iPrime = new ArrayList<>();
	// 소수 판별 메소드 
	public static boolean is_prime(String snumber) {
 
        int number = Integer.parseInt(snumber);

        if(iPrime.contains(number))
            return false;

		// 0 과 1 은 소수가 아니다
		if(number < 2) {
			return false;
		}
		
		// 2 는 소수다
		if(number == 2) {
			iPrime.add(2);
			return true;
		}
		
		for(int i = 2; i < number; i++) {
			// 소수가 아닐경우
			if(number % i == 0) {
				return false;
			}
		}
		// 위 반복문에서 약수를 갖고 있지 않는경우 소수다.
		iPrime.add(number);
		return true;
	}
    
	private static void FindAllNum(String inNum, String remindNum) {
		if(remindNum.length() == 0)
			return;
		
		for(int i = 0; i < remindNum.length(); i++) {
            String newNum = inNum + remindNum.substring(i, i+1);
            String newRemindNum = remindNum.substring(0, i) + remindNum.substring(i+1);
		    if(is_prime(newNum))
			    answer++;            
            
            FindAllNum(newNum, newRemindNum);
        }
	}
	
    public int solution(String numbers) {
        answer = 0;
		
		for(int i = 0; i < numbers.length(); i++) {
			String newNum = Character.toString(numbers.charAt(i));
			String remindNum = numbers.substring(0, i) + numbers.substring(i+1, numbers.length());
            
		    if(is_prime(newNum))
			    answer++;

			FindAllNum(newNum, remindNum);
		}
		
		
        return answer;
    }
}