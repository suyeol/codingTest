class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        
        for(int i = 0; i < participant.length; i++)
        {
            boolean complete = false;
            for(int j = 0; j < completion.length; j++)
            {
                if(completion[j].equals(participant[i]))
                {
                    completion[j] += "c";
                    complete = true;
                    break;
                }
            }
            
            if(!complete)
            {
                answer += participant[i];
                break;
            }
                
        }
        return answer;
    }
}