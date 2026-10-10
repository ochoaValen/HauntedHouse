import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class HauntedHouseTest {

    HauntedHouse hauntedHouse = new HauntedHouse();

    @Test
    public void testIsGhostPresent() {
        assertTrue(hauntedHouse.isGhostPresent());
    }
    @Test
    public void testScareAwayGhost() {
        hauntedHouse.scareAwayGhost();
        assertFalse(hauntedHouse.isGhostPresent());
    }
    @Test
    public void testRefillCandyBowl() {
        hauntedHouse.refillCandyBowl(5);
        assertEquals(15,hauntedHouse.getCandyCount());
    }
    @Test
    void trickOrTreat() {
        hauntedHouse.trickOrTreat(5);
        assertEquals(5,hauntedHouse.getCandyCount() - 5);
    }

    @Test
    void getCandyCount() {
        assertEquals(10,hauntedHouse.getCandyCount());
    }

    @Test
    void spookySound() {
        hauntedHouse.spookySound();
        assertEquals("Boo!",hauntedHouse.spookySound());
    }

    @Test
    void negativeCandy() {
        hauntedHouse.refillCandyBowl(-5);
        assertEquals(10,hauntedHouse.getCandyCount());
    }
    @Test
    void tooManyPeople() {
        hauntedHouse.trickOrTreat(15);
        assertTrue(hauntedHouse.getCandyCount() >= 0);
    }
    @Test
    void runningLow(){
        hauntedHouse.trickOrTreat(10);
        assertEquals(10,hauntedHouse.getCandyCount(), "Bowl needs to be refilled");
    }
    @Test
    void Haunting() {
        hauntedHouse.scareAwayGhost();
        hauntedHouse.bringBackGhost();
        assertTrue(hauntedHouse.isGhostPresent());
    }
}