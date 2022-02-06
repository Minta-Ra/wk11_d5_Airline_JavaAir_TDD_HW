import org.junit.Before;
import org.junit.Test;
import people.passenger.Passenger;
import static org.junit.Assert.assertEquals;


public class PassengerTest {

    Passenger passenger1;

    @Before
    public void before(){
        passenger1 = new Passenger("Anna", 1);
    }

    @Test
    public void hasName(){
        assertEquals("Anna", passenger1.getName());
    }

    @Test
    public void hasNumberOfBags(){
        assertEquals(1, passenger1.getNumOfBags());
    }

}
