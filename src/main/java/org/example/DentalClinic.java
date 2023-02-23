package org.example;

import org.example.staff.Staff;

import java.util.ArrayList;
import java.util.List;

public class DentalClinic {

    private List<Staff> staffList;

    public List<Patient> getPatientList(Staff specificStaff){
        List<Patient> specificStaffPatientList = new ArrayList<>();
        for (Staff staff:staffList) {
            if (staff.equals(specificStaff)){
                specificStaffPatientList=staff.getPatientList();
            }
        }
        return specificStaffPatientList;
    }

}
