package com.projet3bsi.projet3bsi;

import static org.junit.jupiter.api.Assertions.*;

import com.projet3bsi.projet3bsi.Interfaces.IPatients;
import com.projet3bsi.projet3bsi.Models.Patients;
import java.util.HashSet;

import com.projet3bsi.projet3bsi.Models.Patients;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PatientsTest {

    @org.junit.jupiter.api.BeforeEach
    public void setUp() {
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() {
    }

    @org.junit.jupiter.api.Test
    public void countInformationsGT() {
        IPatients patient = new Patients("Guillaume Tricknot");
        HashSet<String> patientDatas = patient.getPatients();
        assertEquals(2, patientDatas.size() );
        assertEquals( 1, patientDatas.stream().filter(o -> o.equals("Adresse : chaussé de Binche 221, 7000 Mons")).count());
        assertEquals( 1, patientDatas.stream().filter(o -> o.equals("Date de naissance : 18/01/2002")).count());
    }
    @org.junit.jupiter.api.Test
    public void countInformationsMC() {
        IPatients patient = new Patients("Maëva Casu");
        HashSet<String> patientDatas = patient.getPatients();
        assertEquals(2, patientDatas.size() );
        assertEquals( 1, patientDatas.stream().filter(o -> o.equals("Adresse : Avenue de la rue 21, 7000 Ghlin")).count());
        assertEquals( 1, patientDatas.stream().filter(o -> o.equals("Date de naissance : 22/11/1998")).count());
    }
    @org.junit.jupiter.api.Test
    public void countInformationsTD() {
        IPatients patient = new Patients("Theo Desoil");
        HashSet<String> patientDatas = patient.getPatients();
        assertEquals(2, patientDatas.size() );
        assertEquals( 1, patientDatas.stream().filter(o -> o.equals("Adresse : Rue du clavier 23, 7340 Paturageq")).count());
        assertEquals( 1, patientDatas.stream().filter(o -> o.equals("Date de naissance : 08/08/2010")).count());
    }
    @org.junit.jupiter.api.Test
    public void countInformationsVF() {
        IPatients patient = new Patients("Victor Fatoux");
        HashSet<String> patientDatas = patient.getPatients();
        assertEquals(2, patientDatas.size() );
        assertEquals( 1, patientDatas.stream().filter(o -> o.equals("Adresse : chassée de l'écran 16, 1679 hornu")).count());
        assertEquals( 1, patientDatas.stream().filter(o -> o.equals("Date de naissance : 26/09/1976")).count());
    }
    @org.junit.jupiter.api.Test
    public void countInformationsBT() {
        IPatients patient = new Patients("Banjamin Tricknot");
        HashSet<String> patientDatas = patient.getPatients();
        assertEquals(2, patientDatas.size() );
        assertEquals( 1, patientDatas.stream().filter(o -> o.equals("Adresse : Avenue de la souris 76, 2754 Dour")).count());
        assertEquals( 1, patientDatas.stream().filter(o -> o.equals("Date de naissance : 30/11/1987")).count());
    }
    @org.junit.jupiter.api.Test
    public void countInformationsCL() {
        IPatients patient = new Patients("Laurent Casu");
        HashSet<String> patientDatas = patient.getPatients();
        assertEquals(2, patientDatas.size() );
        assertEquals( 1, patientDatas.stream().filter(o -> o.equals("Adresse : Rue des hauts parleurs 245, 7664 Charleroi")).count());
        assertEquals( 1, patientDatas.stream().filter(o -> o.equals("Date de naissance : 09/12/1968")).count());
    }
    @org.junit.jupiter.api.Test
    public void countInformationsRVR() {
        IPatients patient = new Patients("Robin Van Roy");
        HashSet<String> patientDatas = patient.getPatients();
        assertEquals(2, patientDatas.size() );
        assertEquals( 1, patientDatas.stream().filter(o -> o.equals("Adresse : chaussé de la caméra 167, 5286 Saint-Ghislain")).count());
        assertEquals( 1, patientDatas.stream().filter(o -> o.equals("Date de naissance : 17/07/2015")).count());
    }
    @org.junit.jupiter.api.Test
    public void countInformationsWT() {
        IPatients patient = new Patients("Walter Tricknot");
        HashSet<String> patientDatas = patient.getPatients();
        assertEquals(2, patientDatas.size() );
        assertEquals( 1, patientDatas.stream().filter(o -> o.equals("Adresse : Avenue des touches 67, 5649 Binche")).count());
        assertEquals( 1, patientDatas.stream().filter(o -> o.equals("Date de naissance : 12/03/2018")).count());
    }
    @org.junit.jupiter.api.Test
    public void countInformationsGC() {
        IPatients patient = new Patients("Gaëtan Czornomudiak");
        HashSet<String> patientDatas = patient.getPatients();
        assertEquals(2, patientDatas.size() );
        assertEquals( 1, patientDatas.stream().filter(o -> o.equals("Adresse : Rue de l'alimentation 298, 2389 Boussu")).count());
        assertEquals( 1, patientDatas.stream().filter(o -> o.equals("Date de naissance : 29/06/1991")).count());
    }
}