package com.projet3bsi.projet3bsi;

import com.projet3bsi.projet3bsi.Models.UnitCare;
import java.util.HashSet;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class UnitCareTest {

    @org.junit.jupiter.api.BeforeEach
    public void setUp() {
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() {
    }

    @org.junit.jupiter.api.Test
    public void countUnitCares() {
        UnitCare unitCare = new UnitCare();
        HashSet<String> unitCares = unitCare.getUnitCares();
        assertEquals(3, unitCares.size() );

    }
    @org.junit.jupiter.api.Test
    public void isPediatricFirstOne() {
        UnitCare unitCare = new UnitCare();
        HashSet<String> unitCares = unitCare.getUnitCares();
        assertEquals("Pédiatrie", unitCares.stream().findFirst().get());

    }
    @org.junit.jupiter.api.Test
    public void isUrgencyCareExists() {
        UnitCare unitCare = new UnitCare();
        HashSet<String> unitCares = unitCare.getUnitCares();
        java.util.stream.Stream<String> result = unitCares.stream().filter( o -> o.equals(("Urgences")));
        assertNotEquals(0, result.count());

    }
}