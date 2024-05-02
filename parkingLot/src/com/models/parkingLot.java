package com.models;
import java.util.*;
public class parkingLot {
    private static parkingLot instance = null;
    private List<floor> floors;

    public static final String ID = "PKGUNDALOT1234";

    private parkingLot(){
        floors = new ArrayList<>();
    }

    public static parkingLot parkingLot(){
        if (instance == null) instance = new parkingLot();
        return instance;
    }

    public void addFloor(int totalBikeSlots, int totalCarSlots){
        floors.add(new floor(floors.size()+1, totalBikeSlots, totalCarSlots));
        return;
    }

    public List<floor> getFloors() {
        return floors;
    }
}
