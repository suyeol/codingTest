import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        ArrayList<Integer> bridge = new ArrayList<Integer>(); // 타입 지정

        ArrayList<Integer> atruck = new ArrayList<Integer>(); // 타입 지정
        for(int i = 0; i < truck_weights.length; i++)
        {
            atruck.add(truck_weights[i]);
        }     
        
        //첫번째 트럭 올라감.
        int second = 1;
        int truck = atruck.remove(0);
        bridge.add(truck);		
        int nowBridgeWeight = truck;

		while(atruck.size() > 0)
        {
      
            //while 한번이 한칸 이동하는 행위
			second++;     
            
			if(bridge.size() >= bridge_length)
            {
                //다 건너면 내리면서 앞으로 이동.
                int tmp = bridge.remove(0);
                nowBridgeWeight -= tmp;
            }

            int next = atruck.get(0);
            if(nowBridgeWeight + next <= weight)
            {
                //if(bridge.size() < bridge_length)
                {
					//더 올라탐.
                    int tmp = atruck.remove(0);
                    bridge.add(tmp);
                    nowBridgeWeight += tmp;
                }
            } else {
                bridge.add(0);
            }
            
        }

        second += bridge_length;

        return second;
    }
}

