package service;
import models.*;
import java.util.*;
public class playTicTacToe {
    private board board;
    private List<player> players;
    private posGenerator playTurns;

    public playTicTacToe(int boardSize, int playersCount){
        this.board = new board(boardSize);
        this.players = new ArrayList<>();
        this.playTurns = new posGenerator(board);
        for(int i=0;i<playersCount;i++) {
            players.add(new player(i + 1));
        }
    }

    public String play(){
        int i=0, coords[];
        do{
            if(i >= players.size()) i = 0;
            i++;
            coords = playTurns.getMarkings(board);
            board.setBoardMarkings(coords[0], coords[1], i);
        }while(!isWinner(coords[0],coords[1], i) && !isFinish());
        return isFinish()?"Draw":"Winner: "+i;
    }

    public boolean isFinish(){
        int[][] boardMarks = board.getBoard();
        for(int i=0;i< board.getSize();i++){
            for(int j=0;j<board.getSize();j++){
                if(boardMarks[i][j] == 0) return false;
            }
        }
        return true;
    }
    public boolean isWinner(int x, int y, int id) {
        return diagnol(x, y, id) || row(x, y, id) || column(x, y, id) || oppositeDiagnol(x, y, id);
    }

    public boolean diagnol(int x, int y, int id){
        int[][] markings = board.getBoard();
        if(x != y) return false;
        for(int i=0,j=0;i< board.getSize()&&j<board.getSize();i++,j++){
            if(markings[i][j] == id) continue;
            else return false;
        }
        return true;
    }

    public boolean row(int x, int y, int id){
        int[][] markings = board.getBoard();
        for(int i=0;i< board.getSize();i++){
            if(markings[x][i] == id) continue;
            else return false;
        }
        return true;
    }

    public boolean column(int x, int y, int id){
        int[][] markings = board.getBoard();
        for(int i=0;i< board.getSize();i++){
            if(markings[i][y] == id) continue;
            else return false;
        }
        return true;
    }

    public boolean oppositeDiagnol(int x, int y, int id){
        int[][] markings = board.getBoard();
        if(x != board.getSize()-y-1) return false;
        for(int i=0,j=board.getSize()-1;i< board.getSize()&&j>=0;i++,j--){
            if(markings[i][j] == id) continue;
            else return false;
        }
        return true;
    }


}
