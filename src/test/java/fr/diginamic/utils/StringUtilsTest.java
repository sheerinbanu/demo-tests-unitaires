package fr.diginamic.utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {

    @Test
    void TestlevenshteinDistance1() {

        int result = StringUtils.levenshteinDistance("distance", "instance");
        assertEquals(2, result);
    }

    @Test
    void TestlevenshteinDistance2() {

        int result = StringUtils.levenshteinDistance("Chine", "Chien");
        assertEquals(2, result);
    }

    @Test
    void TestlevenshteinDistance3() {

        int result = StringUtils.levenshteinDistance(null, "Chien");
        assertEquals(0, result);
    }
}