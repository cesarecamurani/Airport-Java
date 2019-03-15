package transports;

import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;

import static org.mockito.Mockito.*;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class AirportTest {

    private ArrayList<Plane> hangar = new ArrayList<>();
    private Plane boeing;
    private Airport gatwick = new Airport(hangar);

    @Before
    public void setUp(){
        boeing = new Plane("Boeing");
    }

    @Test
    public void clearForLandingUnderNormalConditions(){
        gatwick.clearForLanding(boeing);
        assertThat("Hangar contains boeing", gatwick.hangar, hasItem(boeing));
    }

    @Test
    public void clearForTakeOffUnderNormalConditions(){
        gatwick.clearForLanding(boeing);
        gatwick.clearForTakeOff(boeing);
        assertThat("Hangar doesn't contains boeing", gatwick.hangar, not(hasItem(boeing)));
    }

    @Test(expected=Error.class)
    public void cannotLandIfAirportIsFull() {
        for(var i = 0; i <= 10; i++) {
            gatwick.clearForLanding(boeing);
        }
        assertThrows(Error.class, () -> gatwick.clearForLanding(boeing));
    }

}



