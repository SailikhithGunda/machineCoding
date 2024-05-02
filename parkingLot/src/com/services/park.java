package com.services;
import com.models.*;
import java.lang.*;
import java.util.*;

public class park {
    parkingLot p = parkingLot.parkingLot();
    public ticket parkVehicle(vehicle v){
        String type = v.getType();
        ticket t;
        if(type.equals("Car")){
            List<floor> floors = p.getFloors();
            for(floor f: floors){
                if(f.isFullCars()) continue;
                int slotid = f.getClosestCarSlot();
                t = new ticket(f.getId(), slotid, v.getId());

            }
        }
//         you can implement an exception for type.
        else{

        }
        return t;
    }

}
