package com.projet3bsi.projet3bsi.Models;

import com.projet3bsi.projet3bsi.Interfaces.IUnitPeople;

import java.util.HashSet;

public class UnitPeople implements IUnitPeople {
    private HashSet<String> unitPeople;

    /* Constructor */
    public UnitPeople (String currentUnit){
        unitPeople = new HashSet<>();
        switch (currentUnit)
        {
            case "Pédiatrie":
                unitPeople.add("Guillaume Tricknot");
                unitPeople.add("Maëva Casu");
                unitPeople.add("Theo Desoil");
                unitPeople.add("Victor Fatoux");
                break;
            case "Urgences":
                unitPeople.add("Banjamin Tricknot");
                unitPeople.add("Laurent Casu");
                unitPeople.add("Robin Van Roy");
                break;
            case "Oncologie":
                unitPeople.add("Walter Tricknot");
                unitPeople.add("Gaëtan Czornomudiak");
                break;
        }

    }

    /* methods */
    public HashSet<String> getUnitPeople(){return unitPeople;}


}
