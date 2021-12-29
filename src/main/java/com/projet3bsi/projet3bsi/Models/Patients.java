package com.projet3bsi.projet3bsi.Models;

import java.util.HashSet;

public class Patients {
    private HashSet<String> patients;

    /* Constructor */
    public Patients (String currentPatient){
        patients = new HashSet<>();
        switch (currentPatient)
        {
            case "Guillaume Tricknot":
                patients.add("Age : 19 ans");
                break;
            case "Maëva Casu":
                patients.add("Age : 20 ans");
                break;
        }

    }

    /* methods */
    public HashSet<String> getPatients(){
        return patients;
    }
}
