import java.util.*;
class Solution {
	public int solution(int[] scoville, int K) {
		int answer = 0;
		ArrayList<Integer> ascoville = new ArrayList<Integer>(); // 타입 지정

		for(int i = 0; i < scoville.length; i++)
		{
			if(scoville[i] < K)
				ascoville.add(scoville[i]);
		}

		Collections.sort(ascoville);

		while(ascoville.size() > 1)
		{
			int first = ascoville.remove(0);
			int second = ascoville.remove(0);
			int diffK = first + (second * 2);
			answer++;
			
			if(diffK < K)
			{
				ascoville.add(diffK);
				Collections.sort(ascoville);
			}	
		}

		if(ascoville.size() == 1)
			return -1;
		else
			return answer;
	}

}



import java.util.*;
class Solution {
	public int solution(int[] scoville, int K) {
		int answer = 0;
		ArrayList<Integer> ascoville = new ArrayList<Integer>(); // 타입 지정

		for(int i = 0; i < scoville.length; i++)
		{
			ascoville.add(scoville[i]);
		}

		Collections.sort(ascoville);

		while(ascoville.size() > 1)
		{
            if(ascoville.get(0) < K)
            {
                int first = ascoville.remove(0);
                int second = ascoville.remove(0);
                int diffK = first + (second * 2);       
                answer++;
				ascoville.add(diffK);
				Collections.sort(ascoville);                
            } else 
                break;
		}

		if(ascoville.size() == 1 && ascoville.get(0) < K)
        {
            return -1;            
        }
        else if(ascoville.size() == 1)
        {
			return answer;
        }
		else
			return answer;
	}
}