package com.projet3bsi.projet3bsi;

import com.projet3bsi.projet3bsi.Interfaces.IUnitPeople;
import com.projet3bsi.projet3bsi.Models.UnitPeople;
import java.util.HashSet;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class UnitPeopleTest
{
    @org.junit.jupiter.api.BeforeEach
    public void setUp() {
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() {
    }

    @org.junit.jupiter.api.Test
    public void countUnitPeoplePédiatrie() {
        IUnitPeople unitPeople = new UnitPeople("Pédiatrie");
        HashSet<String> unitPeoples = unitPeople.getUnitPeople();
        assertEquals(4, unitPeoples.size() );

    }
    @org.junit.jupiter.api.Test
    public void countUnitPeopleUrgences() {
        IUnitPeople unitPeople = new UnitPeople("Urgences");
        HashSet<String> unitPeoples = unitPeople.getUnitPeople();
        assertEquals(3, unitPeoples.size() );

    }
    @org.junit.jupiter.api.Test
    public void countUnitPeopleOncologie() {
        IUnitPeople unitPeople = new UnitPeople("Oncologie");
        HashSet<String> unitPeoples = unitPeople.getUnitPeople();
        assertEquals(2, unitPeoples.size() );

    }

}