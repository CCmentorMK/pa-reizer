package org.example;

import org.example.staff.Staff;

import java.time.LocalDateTime;
import java.util.List;

public class Visit {

    private List<Staff> staffList;

    private Patient patient;

    private ProcedureType procedureType;

    private int tooth;

    String description;

    LocalDateTime visitDate;

    public Visit(List<Staff> staffList, Patient patient, ProcedureType procedureType, int tooth, String description, LocalDateTime visitDate) {
        this.staffList = staffList;
        this.patient = patient;
        this.procedureType = procedureType;
        this.tooth = tooth;
        this.description = description;
        this.visitDate = visitDate;
    }

    public ProcedureType getProcedureType() {
        return procedureType;
    }

    public List<Staff> getStaffList() {
        return staffList;
    }

    public Patient getPatient() {
        return patient;
    }
}




