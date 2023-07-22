package Recursion;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class NQueens2 {
    public static void main(String[] args) {
        int N =4;
        List<List<String>> queen = solveNQueens(N);
        int i=1;
        for(List<String> it:queen){
            System.out.println("Arrangement " + i);
            for(String s:it)
                System.out.println(s);
            System.out.println();
            i++;
        } 
    }

    private static List<List<String>> solveNQueens(int n) {
        char[][] board=new char[n][n];
        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++)
                board[i][j]='.';
        List<List<String>> res = new ArrayList<List<String>>();
        int leftrow[]=new int[n];
        int upperDiagonal[]=new int[2*n-1];
        int lowerDiagonal[]=new int[2*n-1];
        System.out.println("leftrowfirst : "+leftrow[1]);
        solve(0,board,res,leftrow,lowerDiagonal,upperDiagonal);
        return res;
    }

    private static void solve(int col, char[][] board, List<List<String>> res, int[] leftrow, int[] lowerDiagonal,
            int[] upperDiagonal) {
                if(col==board.length){
                    System.out.println("   "+col + "   add : ");
                    res.add(construct(board));
                    return;
                }
                for(int row=0;row<board.length;row++){
                    System.out.println(row + "   leftrow second : "+leftrow[row]);
                    if(leftrow[row]==0 && lowerDiagonal[row+col]==0 && upperDiagonal[board.length-1+col-row]==0){
                        System.out.println(row +"   "+col + "   leftrow Third : "+leftrow[row]);
                        board[row][col]='Q';
                        leftrow[row]=1;
                        lowerDiagonal[row+col]=1;
                        upperDiagonal[board.length-1+col-row]=1;
                        solve(col+1, board, res, leftrow, lowerDiagonal, upperDiagonal);
                        System.out.println(row +"   "+col+ "   leftrow fourth : "+leftrow[row]);
                        board[row][col]='.';
                        leftrow[row]=0;
                        lowerDiagonal[row+col]=0;
                        upperDiagonal[board.length-1+col-row]=0;
                    }
                }
    }

    private static List<String> construct(char[][] board) {
        List<String> res = new LinkedList<>();
        for(int i=0;i<board.length;i++){
            String s= new String(board[i]);
            res.add(s);
        }
        return res;
    }
}
