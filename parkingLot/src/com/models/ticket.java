package com.models;

public class ticket {
    private String id;
    private String vNo;
    public ticket(int floorNumber, int slotNumber, String vNo){
        id = floorNumber + " " + slotNumber;
        this.vNo = vNo;
    }

    public String getvNo() {
        return vNo;
    }

    public void setvNo(String vNo) {
        this.vNo = vNo;
    }
}
