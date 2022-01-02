package com.projet3bsi.projet3bsi.Models;

import java.util.HashSet;
import com.projet3bsi.projet3bsi.Interfaces.IUnitCare;

public class UnitCare implements IUnitCare {

        private HashSet<String> unitCares;

        /* Constructor */
        public UnitCare (){
            unitCares = new HashSet<>();
            unitCares.add("Urgences");
            unitCares.add("Pédiatrie");
            unitCares.add("Oncologie");
        }

        /* methods */
        public HashSet<String> getUnitCares(){
            return unitCares;
        }


}
