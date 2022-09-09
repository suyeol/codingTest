import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        
        //바구니 생성
        int[] baguni = new int[moves.length];
        Arrays.fill(baguni,0);
        
        //board->new_board
        int[][] new_board = new int[board.length][board[0].length];
        for(int i = 0; i < board.length; i++) {
            Arrays.fill(new_board[i], 0);
        }
        
        for(int i = 0; i < board[0].length; i++) {
            for(int j = 0; j < board.length; j++) {
                new_board[i][j] = board[j][i];
            }
        }
        /*
        for(int i = 0; i < board[0].length; i++) {
            for(int j = 0; j < board.length; j++) {
                System.out.println(new_board[i][j]);
            }
            System.out.println("----------");
        }
        //*/
        
        int baguniCnt = 0;
        //움직임
        for(int i = 0; i < moves.length; i++) {
            //moves숫자-1의 board의 값을 거꾸로 탐색(스택)
            //for(int j = new_board[moves[i]-1].length-1; j > 0; j--) {
            for(int j = 0; j < new_board[moves[i]-1].length; j++) {
                //0이면 비어 있으므로 무시
                if(new_board[moves[i]-1][j] != 0) {
                    //System.out.println(board[moves[i]-1][j]);
                    //바구니의 맨윗칸과 현재 board의 값이 같으면 
                    if(baguni[baguniCnt] == new_board[moves[i]-1][j]) {
                        answer += 2;
                        //바구니 1개 사라지고
                        //pop
                        baguni[baguniCnt--] = 0;
                        //baguniCnt--;
                    } else {
                        //push
                        baguni[++baguniCnt] = new_board[moves[i]-1][j];
                    }
                    // 선택된 board의 값도 사라진다
                    new_board[moves[i]-1][j] = 0;
                    break;
                }
            }
        }
        return answer;
    }
}