package org.example.staff;

import org.example.Patient;
import org.example.Visit;
import java.util.ArrayList;
import java.util.List;

public abstract class Staff {

    private String name;

    private Specialization specialization;

    protected List<Visit> visitList;

    protected List<Patient> patientList;

    public Staff(String name, Specialization specialization) {
        this.name = name;
        this.specialization = specialization;
        visitList = new ArrayList<>();
        patientList = new ArrayList<>();
    }
    public void addPatient(){
        for (Visit visit:visitList) {
            for (Staff staff: visit.getStaffList()){
                if (staff.equals(this)){
                    patientList.add(visit.getPatient());
                }
            }
        }
    }

    public List<Patient> getPatientList(){
        return patientList;
    }

}
