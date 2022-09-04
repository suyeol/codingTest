import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
        
        ArrayList<Integer> arrList = new ArrayList<Integer>();
        
        int old = 0;
        for(int i = 0; i < arr.length; i++) {
            if(i == 0)
            {
                arrList.add(arr[i]);
                old = arr[i];
                continue;
            }
                
            if(old != arr[i])
            {
                arrList.add(arr[i]);
                old = arr[i];
            }
        }

        answer = new int[arrList.size()];
        for(int i = 0; i < arrList.size(); i++) {
            answer[i] = arrList.get(i);
        }
        
        return answer;
    }
}