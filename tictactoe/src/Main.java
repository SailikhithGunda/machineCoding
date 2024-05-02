import java.util.*;
import models.*;
import service.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int boardSize = sc.nextInt();
       sc.nextLine();
       int playersCount = sc.nextInt();
       sc.nextLine();
       playTicTacToe game = new playTicTacToe(boardSize, playersCount);
       System.out.println(game.play());
    }
}