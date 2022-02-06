import flight.Plane;
import flight.PlaneType;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class PlaneTest {

    Plane plane1;
    Plane plane2;

    @Before
    public void before(){
        plane1 = new Plane(PlaneType.BOEING_737);
        plane2 = new Plane(PlaneType.AIRBUS_A319);
    }

    @Test
    public void hasPlaneType(){
        assertEquals(PlaneType.BOEING_737, plane1.getPlaneType());
    }

    @Test
    public void hasCapacity(){
        assertEquals(5, plane1.getPlaneType().getCapacity());
        assertEquals(156, plane2.getPlaneType().getCapacity());
    }

    @Test
    public void hasTotalWeight(){
        assertEquals(79.015, plane1.getPlaneType().getTotalWeight(), 0.0);
        assertEquals(68.000, plane2.getPlaneType().getTotalWeight(), 0.0);
    }
}
