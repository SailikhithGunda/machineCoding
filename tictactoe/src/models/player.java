package models;
import java.lang.*;
import java.util.*;
public class player {
    private final int id;
    private String name;
    public player(int id){
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
