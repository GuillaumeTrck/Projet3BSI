package com.projet3bsi.projet3bsi.Models;

import com.projet3bsi.projet3bsi.Interfaces.IUnitPeople;

import java.util.HashSet;


public class UnitPeople implements IUnitPeople {
    private HashSet<String> unitPeople;

    /**
     * Constructor
     * @param currentUnit
     * @author Guillaume
     * @version  1.0
     */
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

    /**
     * Methode qui renvoie les différents patients en fonction de l'unité selectionné
     * @return
     * @author Guillaume
     * @version  1.0
     */
    public HashSet<String> getUnitPeople(){return unitPeople;}


}
