package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import javax.sound.midi.VoiceStatus;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;
    Visitor visitor;
    Visitor visitor2;
    Visitor visitor3;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
        visitor = new Visitor(25, 150, 22.00);
        visitor2 = new Visitor(11, 130, 7.00);
        visitor3 = new Visitor(21,201,30.00);
    }

    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, rollerCoaster.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
    }

    @Test
    public void canRideRollercoaster(){
        assertEquals(true, rollerCoaster.isAllowedTo(visitor));
    }

    @Test
    public void cannotRideRollercoaster(){
        assertEquals(false, rollerCoaster.isAllowedTo(visitor2));
    }

    @Test
    public void canChargeDoubleToTallPeople(){
        assertEquals(16.80, rollerCoaster.priceFor(visitor3), 0.0);
    }
}
