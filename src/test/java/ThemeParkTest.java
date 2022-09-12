
import attractions.RollerCoaster;
import org.junit.Before;
import org.junit.Test;
import people.Visitor;
import stalls.IceCreamStall;
import stalls.ParkingSpot;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {
    ThemePark themePark;
    RollerCoaster rollerCoaster;
    IceCreamStall iceCreamStall;
    Visitor visitor;

    @Before
    public void setUp(){
        themePark = new ThemePark();
        rollerCoaster = new RollerCoaster("Big Dipper", 5);
        iceCreamStall = new IceCreamStall("Coneheads", "Dan Aykroyd", ParkingSpot.A1, 8);
        visitor = new Visitor(25,150,25.00);
    }

    @Test
    public void canAddAttractionToReviewedList(){
        themePark.addAttractionOrStall(rollerCoaster);
        assertEquals(1, themePark.getAllReviewed());
    }

    @Test
    public void canAddStallToReviewedList(){
        themePark.addAttractionOrStall(iceCreamStall);
        assertEquals(1, themePark.getAllReviewed());
    }

    @Test
    public void canIncreaseVisitCount(){
        themePark.visit(visitor, rollerCoaster);
        assertEquals(1, rollerCoaster.getVisitCount());
    }

    @Test
    public void canAddReview(){
        themePark.addReview(rollerCoaster);
        assertEquals(1, themePark.getAllReviews());
    }


}
