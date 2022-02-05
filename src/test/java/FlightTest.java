import flight.Flight;
import flight.Plane;
import flight.PlaneType;
import org.junit.Before;
import org.junit.Test;
import people.crew.CabinCrewMember;
import people.crew.Pilot;
import people.crew.Rank;
import people.passenger.Passenger;
import static org.junit.Assert.assertEquals;


public class FlightTest {

    Flight flight;
    Pilot pilot1;
    Pilot pilot2;
    CabinCrewMember cabinCrewMember1;
    CabinCrewMember cabinCrewMember2;
    Passenger passenger1;
    Passenger passenger2;
    Passenger passenger3;
    Passenger passenger4;
    Plane plane;

    @Before
    public void before(){
        plane = new Plane(PlaneType.BOEING_737);
        flight = new Flight(plane, "EZY6923", "AMS", "EDI", "18:45");
        pilot1 = new Pilot("Cameron Dewar", Rank.CAPTAIN, "PPL8788540");
        pilot2 = new Pilot("Jake Smith", Rank.FIRST_OFFICER, "PPL7550833");
        cabinCrewMember1 = new CabinCrewMember("Sandy Higgins", Rank.FLIGHT_ATTENDANT);
        cabinCrewMember2 = new CabinCrewMember("Kyle Rogers", Rank.PURSER);
        passenger1 = new Passenger("Samantha", 2);
        passenger2 = new Passenger("Peter", 1);
        passenger3 = new Passenger("Anna", 1);
        passenger4 = new Passenger("Jack", 2);
    }

    @Test
    public void flightHasPlane(){
        assertEquals(PlaneType.BOEING_737, flight.getPlane().getPlaneType());
    }

    @Test
    public void flightHasPilots(){
        flight.addPilot(pilot1);
        flight.addPilot(pilot2);
        assertEquals(2, flight.getPilots().size());
    }

    @Test
    public void flightHasCabinCrewMembers(){
        flight.addCabinCrewMember(cabinCrewMember1);
        flight.addCabinCrewMember(cabinCrewMember2);
        assertEquals(2, flight.getCabinCrewMembers().size());
    }

    @Test
    public void flightHasPassengers(){
        flight.addPassenger(passenger1);
        flight.addPassenger(passenger2);
        flight.addPassenger(passenger3);
        flight.addPassenger(passenger4);
        assertEquals(4, flight.getPassengers().size());
    }

    @Test
    public void hasFlightNumber(){
        assertEquals("EZY6923", flight.getFlightNumber());
    }

    @Test
    public void hasDestination(){
        assertEquals("AMS", flight.getDestination());
    }

    @Test
    public void hasDepartureAirport(){
        assertEquals("EDI", flight.getDepartureAirport());
    }

    @Test
    public void hasDepartureTime(){
        assertEquals("18:45", flight.getDepartureTime());
    }

}
