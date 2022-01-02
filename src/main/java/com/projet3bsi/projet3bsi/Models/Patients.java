package com.projet3bsi.projet3bsi.Models;

import com.projet3bsi.projet3bsi.Interfaces.IPatients;

import java.util.HashSet;

public class Patients implements IPatients {
    private HashSet<String> patients;

    /* Constructor */
    public Patients (String currentPatient){
        patients = new HashSet<>();
        switch (currentPatient)
        {
            case "Guillaume Tricknot":
                patients.add("Adresse : chaussé de Binche 221, 7000 Mons");
                patients.add("Date de naissance : 18/01/2002");

                break;
            case "Maëva Casu":
                patients.add("Adresse : Avenue de la rue 21, 7000 Ghlin");
                patients.add("Date de naissance : 22/11/1998");

                break;
            case "Theo Desoil" :
                patients.add("Adresse : Rue du clavier 23, 7340 Paturageq");
                patients.add("Date de naissance : 08/08/2010");

                break;
            case "Victor Fatoux" :
                patients.add("Adresse : chassée de l'écran 16, 1679 hornu");
                patients.add("Date de naissance : 26/09/1976");

                break;
            case "Banjamin Tricknot" :
                patients.add("Adresse : Avenue de la souris 76, 2754 Dour");
                patients.add("Date de naissance : 30/11/1987");

                break;
            case "Laurent Casu" :
                patients.add("Adresse : Rue des hauts parleurs 245, 7664 Charleroi");
                patients.add("Date de naissance : 09/12/1968");

                break;
            case "Robin Van Roy" :
                patients.add("Adresse : chaussé de la caméra 167, 5286 Saint-Ghislain");
                patients.add("Date de naissance : 17/07/2015");

                break;
            case "Walter Tricknot" :
                patients.add("Adresse : Avenue des touches 67, 5649 Binche");
                patients.add("Date de naissance : 12/03/2018");

                break;
            case "Gaëtan Czornomudiak" :
                patients.add("Adresse : Rue de l'alimentation 298, 2389 Boussu");
                patients.add("Date de naissance : 29/06/1991");

                break;
        }

    }

    /* methods */
    public HashSet<String> getPatients(){
        return patients;
    }
}
