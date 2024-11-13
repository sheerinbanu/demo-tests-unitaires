package fr.diginamic.enumerations;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SaisonTest {

    @Test
    void TestvalueOfLibelle1() {

        Saison result = Saison.valueOfLibelle("Printemps");

        assertEquals(Saison.PRINTEMPS, result);
    }

    @Test
    void TestvalueOfLibelle2(){
        Saison result = Saison.valueOfLibelle("Hiver");

        assertEquals(Saison.HIVER, result);
    }

    @Test
    void TestvalueOfLibelle3(){
        Saison result = Saison.valueOfLibelle(null);

        assertNull(result);
    }

}