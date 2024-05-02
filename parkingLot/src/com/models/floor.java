package com.models;
import java.util.*;

public class floor {
    private final int id;
    private int totalBikeSlots;
    private int totalCarSlots;
    List<slot> bikeSlots;
    List<slot> carSlots;

    private int bikeOccupied;
    private int carOccupied;

    private int closestBikeSlot = 0;
    private int closestCarSlot = 0;

    floor(int id){
        this.id = id;
        totalBikeSlots = 10;
        totalCarSlots = 10;
        bikeSlots = new ArrayList<>(10);
        carSlots = new ArrayList<>(10);
    }

    public floor(int id, int totalBikeSlots, int totalCarSlots){
        this.id = id;
        this.totalBikeSlots = totalBikeSlots;
        this.totalCarSlots = totalCarSlots;
        bikeSlots = new ArrayList<>(totalBikeSlots);
        carSlots = new ArrayList<>(totalCarSlots);
    }

    public void addSlot(String type){
        switch (type){
            case "Bike":
                this.totalBikeSlots += 1;
                bikeSlots.add(new slot(bikeSlots.size()+1, "Bike"));
                break;
            case "Car":
                this.totalCarSlots += 1;
                carSlots.add(new slot(carSlots.size()+1, "Car"));
        }
    }

    public int getId() {
        return id;
    }

    public List<slot> getBikeSlots() {
        return bikeSlots;
    }

    public List<slot> getCarSlots() {
        return carSlots;
    }

    public int getCarOccupied() {
        return carOccupied;
    }

    public int getBikeOccupied() {
        return bikeOccupied;
    }


    public boolean isFullBikes(){
        return bikeOccupied == bikeSlots.size();
    }

    public boolean isFullCars(){
        return carOccupied == carSlots.size();
    }


    public int getClosestBikeSlot(){
        return closestBikeSlot;
    }

    public void setClosestBikeSlot(int closestBikeSlot) {
        this.closestBikeSlot = closestBikeSlot;
    }

    public int getClosestCarSlot() {
        return closestCarSlot;
    }

    public void setClosestCarSlot(int closestCarSlot) {
        this.closestCarSlot = closestCarSlot;
    }
}
