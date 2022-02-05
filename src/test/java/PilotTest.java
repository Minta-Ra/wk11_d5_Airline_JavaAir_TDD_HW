import org.junit.Before;
import org.junit.Test;
import people.crew.Pilot;
import people.crew.Rank;
import static org.junit.Assert.assertEquals;


public class PilotTest {

    Pilot pilot1;
    Pilot pilot2;

    @Before
    public void before(){
        pilot1 = new Pilot("James Curry", Rank.CAPTAIN, "PPL2266547");
        pilot2 = new Pilot("Carl Smith", Rank.FIRST_OFFICER, "PPL7655429");
    }

    @Test
    public void hasName(){
        assertEquals("James Curry", pilot1.getName());
        assertEquals("Carl Smith", pilot2.getName());
    }

    @Test
    public void hasRank(){
        assertEquals(Rank.CAPTAIN, pilot1.getRank());
        assertEquals(Rank.FIRST_OFFICER, pilot2.getRank());
    }

    @Test
    public void hasLicenceNumber(){
        assertEquals("PPL2266547", pilot1.getLicenceNumber());
        assertEquals("PPL7655429", pilot2.getLicenceNumber());
    }

    @Test
    public void canFlyThePlane(){
        assertEquals("Bruuum brum!", pilot1.flyThePlane());
    }

}
