package models;

public class board {
    static int defaultSize = 3;
    private int size = defaultSize;
    private int[][] boardMarkings;
    public board(int n){
        this.size = n;
        this.boardMarkings = new int[size][size];
    }

    public int getSize() {
        return size;
    }

    public int getBoardMarkings(int x, int y) {
        return boardMarkings[x][y];
    }

    public int[][] getBoard(){
        return this.boardMarkings;
    }

    public void setBoardMarkings(int x, int y, int i) {
        this.boardMarkings[x][y] = i;
    }
}
