package transports;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.function.Executable;

public class PlaneTest {

    @Test
    public void landChangeFlyingStatusToFalse(){
        Plane boeing = new Plane("Boeing");
        boeing.land();
        assertEquals(boeing.flyingStatus, false);
    }

    @Test
    public void takeOffChangeFlyingStatusToTrue(){
        Plane boeing = new Plane("Boeing");
        boeing.land();
        boeing.takeOff();
        assertEquals(boeing.flyingStatus, true);
    }

    @Test
    public void cannotTakeOffIfFlying(){
        assertThrows(IllegalArgumentException.class, new Executable() {

            @Override
            public void execute() {
                Plane boeing = new Plane("Boeing");
                boeing.takeOff();
            }
        });
    }

}

