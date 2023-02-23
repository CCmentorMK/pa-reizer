package org.example.staff;

import org.example.ProcedureType;
import org.example.Visit;

import java.util.ArrayList;
import java.util.List;

public class Dentist extends Staff{

    public Dentist(String name) {
        super(name, Specialization.DENTIST);
        visitList = new ArrayList<>();
        patientList = new ArrayList<>();
    }

    public List<ProcedureType> checkProcedures(){
        List<ProcedureType> procedureTypeList = new ArrayList<>();
        for (Visit visit :visitList) {
            procedureTypeList.add(visit.getProcedureType());
        }
        return procedureTypeList;
    }


}
