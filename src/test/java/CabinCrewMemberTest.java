import org.junit.Before;
import org.junit.Test;
import people.crew.CabinCrewMember;
import people.crew.Rank;

import static org.junit.Assert.assertEquals;


public class CabinCrewMemberTest {

    CabinCrewMember cabinCrewMember;

    @Before
    public void before(){
        cabinCrewMember = new CabinCrewMember("Sandy Higgins", Rank.FLIGHT_ATTENDANT);
    }

    @Test
    public void hasName(){
        assertEquals("Sandy Higgins", cabinCrewMember.getName());
    }

    @Test
    public void hasRank(){
        assertEquals(Rank.FLIGHT_ATTENDANT, cabinCrewMember.getRank());
    }

    @Test
    public void canRelayMessage(){
        assertEquals("Fasten seatbelts", cabinCrewMember.relayMessage());
    }

}
