package snakeAndLadderPackage.models;
import snakeAndLadderPackage.exceptions.*;
public class snake {
    private int start;
    private int end;

    public int getEnd() {
        return end;
    }

    public int getStart() {
        return start;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public void validity() throws IllegalpositionException{
        if(start == 100 || start == 0) throw new IllegalpositionException("Snake is not valid here");
    }
}
