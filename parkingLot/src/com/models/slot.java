package com.models;

public class slot {
    private int id;
    private String type;
    private boolean isOccupied;

    public slot(int id, String type){
        this.id = id;
        this.type = type;
    }

    public boolean isitOccupied(){
        return isOccupied;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setOccupied(boolean occupied) {
        isOccupied = occupied;
    }
}
