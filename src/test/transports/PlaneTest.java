package transports;

import org.junit.Test;
import java.util.ArrayList;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

public class PlaneTest {

    @Test
    public void landChangeFlyingStatusToFalse(){
        Plane boeing = new Plane("Boeing");
        boeing.land();
        assertEquals(boeing.flyingStatus, false);
    }
}