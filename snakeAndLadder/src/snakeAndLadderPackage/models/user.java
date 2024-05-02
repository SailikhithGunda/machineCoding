package snakeAndLadderPackage.models;
import java.util.*;
public class user {
    private final String userId;
    private String userName;

    public String getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
    user(String name){
        this.userId = UUID.RandomUUID.toString();
        this.userName = name;
    }
}
