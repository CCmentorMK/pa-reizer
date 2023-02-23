package org.example.staff;

import java.util.ArrayList;

public class DentalHygienist extends Staff{


    public DentalHygienist(String name) {
        super(name, Specialization.DENTAL_HYGIENIST);
        visitList = new ArrayList<>();
        patientList = new ArrayList<>();
    }
}
