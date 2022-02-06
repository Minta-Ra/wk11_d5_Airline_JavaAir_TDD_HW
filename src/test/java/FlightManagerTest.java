import flight.FlightManager;
import flight.Plane;
import flight.PlaneType;
import org.junit.Before;
import org.junit.Test;
import people.passenger.Passenger;
import java.util.ArrayList;
import static org.junit.Assert.assertEquals;


public class FlightManagerTest {

    FlightManager flightManager;
    Plane plane;
    Passenger passenger1;
    Passenger passenger2;
    Passenger passenger3;
    Passenger passenger4;
    ArrayList<Passenger> passengers;

    @Before
    public void before(){
        plane = new Plane(PlaneType.AIRBUS_A319);
        passenger1 = new Passenger("Samantha", 2);
        passenger2 = new Passenger("Peter", 3);
        passenger3 = new Passenger("Anna", 1);
        passenger4 = new Passenger("Jack", 2);
        passengers = new ArrayList<Passenger>();
        passengers.add(passenger1);
        passengers.add(passenger2);
        passengers.add(passenger3);
        passengers.add(passenger4);
        flightManager = new FlightManager(plane, passengers);
    }

    @Test
    public void flightManagerHasPlane(){
        assertEquals(PlaneType.AIRBUS_A319, flightManager.getPlane().getPlaneType());
    }

    @Test
    public void flightManagerHasPassengers(){
        assertEquals(4, flightManager.getArrayOfPassengers().size());
    }

    @Test
    public void passengerHasBags(){
        assertEquals(2, flightManager.getArrayOfPassengers().get(0).getNumOfBags());
    }

    @Test
    public void hasTotalPlaneBaggageWeightAllowance(){
        assertEquals(3400.0, flightManager.getTotalPlaneBaggageWeightAllowance(), 0.0);
    }

    @Test
    public void hasAverageBaggageWeightForEachPassenger(){
        assertEquals(21.79, flightManager.getAverageBaggageWeightForEachPassenger(plane), 0.0);
    }

    @Test
    public void hasTotalBaggageWeightBookedByPassengers(){
        assertEquals(128, flightManager.getTotalBaggageWeightBookedByPassengers(passengers), 0.0);
    }

    @Test
    public void hasRemainingBaggageWeightAvailable(){
        assertEquals(3272.0, flightManager.getRemainingBaggageWeightAvailable(passengers), 0.0);
    }

}
