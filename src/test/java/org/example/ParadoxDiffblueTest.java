package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class ParadoxDiffblueTest {
    /**
     * Method under test: {@link Paradox#Paradox(int)}
     */
    @Test
    void testConstructor() {
        new Paradox(3);
    }

    /**
     * Method under test: {@link Paradox#Paradox(int)}
     */
    @Test
    void testConstructor2() {
        Paradox actualParadox = new Paradox(3);
        assertEquals(3, actualParadox.getArr().size());
        assertTrue(actualParadox.getResult().isEmpty());
        assertEquals(3, actualParadox.getCountGames());
    }

    /**
     * Method under test: {@link Paradox#getStatisticsParadoxIfDoNotChangeChoice()}
     */
    @Test
    void testGetStatisticsParadoxIfDoNotChangeChoice() {
        assertThrows(ArithmeticException.class, () -> (new Paradox(3)).getStatisticsParadoxIfDoNotChangeChoice());
        assertThrows(ArithmeticException.class, () -> (new Paradox(2)).getStatisticsParadoxIfDoNotChangeChoice());
        assertThrows(IllegalArgumentException.class, () -> (new Paradox(0)).getStatisticsParadoxIfDoNotChangeChoice());
    }

    /**
     * Method under test: {@link Paradox#getStatisticsParadoxIfChangeChoice()}
     */
    @Test
    void testGetStatisticsParadoxIfChangeChoice() {
        assertThrows(ArithmeticException.class, () -> (new Paradox(3)).getStatisticsParadoxIfChangeChoice());
        assertThrows(IllegalArgumentException.class, () -> (new Paradox(0)).getStatisticsParadoxIfChangeChoice());
        assertThrows(ArithmeticException.class, () -> (new Paradox(2)).getStatisticsParadoxIfChangeChoice());
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link Paradox#getArr()}
     *   <li>{@link Paradox#getCountGames()}
     *   <li>{@link Paradox#getResult()}
     * </ul>
     */
    @Test
    void testGetArr() {
        Paradox paradox = new Paradox(3);
        paradox.getArr();
        int actualCountGames = paradox.getCountGames();
        paradox.getResult();
        assertEquals(3, actualCountGames);
    }
}

