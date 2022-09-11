import java.util.*;

class Solution {
    
    static Map<Integer, int[]> keypad = null;
    private static int getDistance(int goalNum, int curNum)
    {
        int distance = 0;
        if(goalNum == 0 )
        {
            goalNum = 11;
        }        
        if(curNum == 0 )
        {
            curNum = 11;
        }            
        
        //x move
        distance += Math.abs(keypad.get(goalNum)[0] - keypad.get(curNum)[0]);
        //y move
        distance += Math.abs(keypad.get(goalNum)[1] - keypad.get(curNum)[1]);
        return distance;
    }
    
    public String solution(int[] numbers, String hand) {
        String answer = "";
        int leftHand = 10;
        int rightHand = 12;
        int rdistance = 0;
        int ldistance = 0;
        if(keypad == null)
        {
            //키패드 배열 생성
            /*
            1   2  3
            4   5  6
            7   8  9
            10 11 12
            //*/        
            keypad = new HashMap<>();
            int x = 0;
            int y = 0;


            for(int n = 1; n < 13; n++)
            {

                int[] value = {x,y};
                keypad.put(n,value);
                x++;
                if(n % 3 == 0)
                {
                    y++;
                    x = 0;
                }                
            }            
        }        

        
        //번호 누름 시작
        for(int i = 0; i < numbers.length; i++)
        {
            switch(numbers[i])
            {
                case 1,4,7:
                    answer += "L";
                    leftHand = numbers[i];
                    break;
                case 3,6,9:
                    answer += "R";
                    rightHand = numbers[i];
                    break;
                default:               
                    rdistance = getDistance(numbers[i], rightHand);
                    ldistance = getDistance(numbers[i], leftHand);


                    if(rdistance == ldistance)
                    {
                        
                        if(hand.equals("right"))
                        {
                            answer += "R";
                            rightHand = numbers[i];
                        } else {
                            answer += "L";
                            leftHand = numbers[i];
                        }
                    } else if(rdistance < ldistance) {
                        answer += "R";
                        rightHand = numbers[i];                       
                    } else {
                        answer += "L";
                        leftHand = numbers[i];
                    }
                    break;
            }
        }
        return answer;
    }
}