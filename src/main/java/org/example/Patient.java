package org.example;

import java.util.ArrayList;
import java.util.List;

public class Patient {
    private int id;

    private String name;

    private boolean loyalCustomer;

    private List<Visit> visitList;

    public Patient(int id, String name) {
        this.id = id;
        this.name = name;
        loyalCustomer=false;
        visitList = new ArrayList<>();
    }

    public boolean isLoyalCustomer(){
        return false;
    }


}
