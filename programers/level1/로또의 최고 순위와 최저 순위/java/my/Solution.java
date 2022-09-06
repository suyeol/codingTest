class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        
        int[] rank = {6,6,5,4,3,2,1};
        
        int correct = 0;
        int zeroCnt = 0;
        
        for(int i = 0; i < lottos.length; i++)
        {
            if(lottos[i] == 0)
            {
                zeroCnt++;
                continue;
            }
                
            
            for(int j = 0; j < win_nums.length; j++)
            {
                if(lottos[i] == win_nums[j])
                {
                    correct++;
                    break;
                }
                    
            }
        }
        
        int highScore = correct + zeroCnt;
        int lowScore = correct;
        
        answer[0] = rank[highScore];
        answer[1] = rank[lowScore];
        
        return answer;
    }
}