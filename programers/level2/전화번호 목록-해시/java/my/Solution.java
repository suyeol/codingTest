import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        
        //길이 짧은순으로 정렬
        Arrays.sort(phone_book, Comparator.comparing(String::length));
        
        //길이 긴순으로 바꿈
        //Arrays.sort(phone_book, Comparator.reverseOrder());
        
        for(int i = phone_book.length-1; i >= 0; i-- )
        {
            String main1 = phone_book[i];
            //for(int j = i-1; j >= 0; j--)
            for(int j = 0; j < i; j++)
            {
                //if(main.charAt(0) == phone_book[j].charAt(0) && main.contains(phone_book[j]))
				if(main1.startsWith(phone_book[j]))
                {
                    answer = false;
                    break;
                }
            }
            if(!answer)
            {
                break;
            }
        }
        
        
        return answer;
    }
}