package com.projet3bsi.projet3bsi.Models;

import java.util.HashSet;
import com.projet3bsi.projet3bsi.Interfaces.IUnitCare;


public class UnitCare implements IUnitCare {

        private HashSet<String> unitCares;

    /**
     * Constructor
     * @author Guillaume
     * @version  1.0
     */
    public UnitCare (){
            unitCares = new HashSet<>();
            unitCares.add("Urgences");
            unitCares.add("Pédiatrie");
            unitCares.add("Oncologie");
        }

    /**
     * Méthode qui renvoie les différentes unités
     * @return
     * @author Guillaume
     * @version  1.0
     */
    public HashSet<String> getUnitCares(){
            return unitCares;
        }


}
