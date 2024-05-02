package snakeAndLadderPackage.services;

import java.util.Random;

public class dice {
    public int getValue(){
        return new Random.nextInt(6)+1;
    }
}
