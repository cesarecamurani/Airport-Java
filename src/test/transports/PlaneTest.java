package transports;

import org.junit.*;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.function.Executable;

public class PlaneTest {

    private Plane boeing;

    @Before
    public void setUp(){
        boeing = new Plane("Boeing");
    }

    @Test
    public void landChangeFlyingStatusToFalse(){
        boeing.land();
        assertFalse(boeing.flyingStatus);
    }

    @Test
    public void takeOffChangeFlyingStatusToTrue(){
        boeing.land();
        boeing.takeOff();
        assertTrue(boeing.flyingStatus);
    }

    @Test
    public void cannotTakeOffIfFlying(){
        assertThrows(IllegalArgumentException.class, new Executable() {
            @Override
            public void execute() { boeing.takeOff(); }
        });
    }

}

