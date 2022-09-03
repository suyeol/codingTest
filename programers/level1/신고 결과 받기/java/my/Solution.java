import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        
        int[][] counter = new int[id_list.length][id_list.length];
        boolean[] tmp = new boolean[id_list.length];
        //배열 초기화
        for(int i = 0; i < counter.length; i++) {
            tmp[i] = false;
            answer[i] = 0;
            for(int j = 0; j < counter[i].length; j++) {
                counter[i][j] = 0;
            }
        }
        
        //report 분석하기
        for(int i = 0; i < report.length; i++) {
            String[] spList = report[i].split(" ");
            
            int er = 0;
            int ed = 0;
            
            for(int j = 0; j < id_list.length; j++) {
                if(id_list[j].equals(spList[0])) {
                    er = j;
                }
                if(id_list[j].equals(spList[1])) {
                    ed = j;
                }
            }

            counter[er][ed] = 1;
        }
        
        //정지계정확인
        for(int j = 0; j < counter[0].length; j++) {
            int alert = 0;
            Arrays.fill(tmp, false);
            for(int i = 0; i < counter.length; i++) {
                if(counter[i][j] == 1) {
                    tmp[i] = true;
                    alert++;
                }
            }
            
            //신고대상
            if(alert >= k) {
                for(int q = 0; q < tmp.length; q++) {
                    if(tmp[q]) {
                        answer[q] = answer[q] + 1;
                    }
                
                }
            }
            
        }
        
        return answer;
    }
}