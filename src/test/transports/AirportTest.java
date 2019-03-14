package transports;

import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;

public class AirportTest {

    private ArrayList<Plane> hangar = new ArrayList<>();
    private Plane boeing;
    private Airport gatwick;

    @Before
    public void setUp(){
        gatwick = new Airport(hangar);
        boeing = new Plane("Boeing");
    }

    @Test
    public void clearForLandingUnderNormalConditions(){
        gatwick.clearForLanding(boeing);
        assertThat(gatwick.hangar, hasItem(boeing));
    }

    @Test
    public void clearForTakeOffUnderNormalConditions(){
        gatwick.clearForLanding(boeing);
        gatwick.clearForTakeOff(boeing);
        assertThat(gatwick.hangar, not(hasItem(boeing)));
    }

}

