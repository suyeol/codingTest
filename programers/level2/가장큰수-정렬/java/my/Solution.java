import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        String answer = "";
   
        String[] str = new String[numbers.length];
        for(int i = 0; i < numbers.length; i++){
            String tmp = Integer.toString(numbers[i]);
            str[i] = tmp + tmp + tmp;
        }
        
        Arrays.sort(str, Comparator.reverseOrder());
        
        for(int i = 0; i < numbers.length; i++){
            int length = str[i].length();
            answer += str[i].substring(0,length/3);
        }

        if(answer.charAt(0) == '0')   return "0";

        return answer;
    }
}