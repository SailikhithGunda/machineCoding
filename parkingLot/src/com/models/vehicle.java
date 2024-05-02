package com.models;
import java.util.*;
public class vehicle {
    private final String id;
    private final String type;

    public vehicle(String type){
        id = UUID.randomUUID().toString();
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public String getType() {
        return type;
    }
}
