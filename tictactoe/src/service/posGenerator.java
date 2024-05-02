package service;
import models.board;
import java.util.*;
public class posGenerator {
    private int n;

    posGenerator(board B){
        this.n = B.getSize();
    }

    public ArrayList<int[]> posLeft(board b){
        int[][] currentBoard = b.getBoard();
       ArrayList<int[]> positionsRemaining = new ArrayList<int[]>();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(currentBoard[i][j] == 0) positionsRemaining.add(new int[]{i,j});
            }
        }
        return positionsRemaining;
    }
    public int[] generateRandom(board b){
        ArrayList<int[]> positionsToChoose = posLeft(b);
        Random r = new Random();
        return positionsToChoose.get(r.nextInt(positionsToChoose.size()));
    }

    public int[] getMarkings(board b) {
        return generateRandom(b);
    }
}
