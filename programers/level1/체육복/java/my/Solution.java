import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        
        //n	lost	reserve	result
        //4	[2, 3]	[3, 4]	3
        //6 [3,4,5] [3,4,6] 5
        //모든 학생은 기본적으로 1개의 체육복이 있다.
        int []list = new int[n];
        Arrays.fill(list, 1);
        //1111
        //111111
        
        //여벌이 있는 학생은?
        for(int i = 0; i < reserve.length; i++)
        {
            list[reserve[i]-1] +=1;
        }
        //1122
        //112212
        
        //도난 당한 학생은?
        for(int i = 0; i < lost.length; i++)
        {
            list[lost[i]-1] -=1;
        }
        //1012
        //111102
        
        //02020
        //없는 학생의 앞뒤학생이 빌려주자
        for(int i = 0; i < list.length; i++)
        {
            if(list[i] == 0)
            {   
                if(i == 0)
                {
                    if(list[i + 1] > 1)
                    {
                        list[i] += 1;
                        list[i + 1] -= 1;
                    }                    
                } else {
                    if(list[i - 1] > 1)
                    {
                        list[i] += 1;
                        list[i - 1] -= 1;
                    }  else if(i != list.length -1 && list[i + 1] > 1)
                    {
                        list[i] += 1;
                        list[i + 1] -= 1;
                    }
                }
            }
        }
        
        //마지막으로 나갈수 있는 학생은?
         for(int i = 0; i < list.length; i++)
        {
            if(list[i] != 0)
            {
                answer+=1;
            }
        }   
        //4
        
        return answer;
    }
}