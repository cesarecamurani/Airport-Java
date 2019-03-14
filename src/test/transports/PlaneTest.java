package transports;

import org.junit.*;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class PlaneTest {

    private Plane boeing;

    @Before
    public void setUp(){
        boeing = new Plane("Boeing");
    }

    @Test
    public void landChangeFlyingStatusToFalse(){
        boeing.land();
        assertFalse("Flying Status is false", boeing.flyingStatus);
    }

    @Test
    public void takeOffChangeFlyingStatusToTrue(){
        boeing.land();
        boeing.takeOff();
        assertTrue("Flying Status is true", boeing.flyingStatus);
    }

    @Test
    public void cannotTakeOffIfFlying() {
        assertThrows(IllegalArgumentException.class, () -> boeing.takeOff());
    }
}

