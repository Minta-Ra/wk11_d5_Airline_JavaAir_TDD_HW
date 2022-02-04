import org.junit.Before;
import org.junit.Test;
import people.crew.Pilot;
import people.crew.Rank;
import static org.junit.Assert.assertEquals;


public class PilotTest {

    Pilot pilot;

    @Before
    public void before(){
        pilot = new Pilot("James Curry", Rank.CAPTAIN, "PPL2266547");
    }

    @Test
    public void hasName(){
        assertEquals("James Curry", pilot.getName());
    }

    @Test
    public void hasRank(){
        assertEquals(Rank.CAPTAIN, pilot.getRank());
    }

    @Test
    public void hasLicenceNumber(){
        assertEquals("PPL2266547", pilot.getLicenceNumber());
    }

    @Test
    public void canFlyThePlane(){
        assertEquals("Bruuum brum!", pilot.flyThePlane());
    }

}
