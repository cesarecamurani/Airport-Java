package transports;

import org.junit.Test;
import java.util.ArrayList;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;

public class AirportTest {

    private ArrayList<Plane> hangar = new ArrayList<>();

    @Test
    public void clearForLandingUnderNormalConditions(){
        Airport gatwick = new Airport(hangar);
        Plane boeing = new Plane("Boeing");
        gatwick.clearForLanding(boeing);
        assertThat(gatwick.hangar, contains(boeing));
    }

    @Test
    public void clearForTakeOffUnderNormalConditions(){
        Airport gatwick = new Airport(hangar);
        Plane boeing = new Plane("Boeing");
        gatwick.clearForLanding(boeing);
        gatwick.clearForTakeOff(boeing);
        assertThat(gatwick.hangar, not(hasItem(boeing)));
    }

}

