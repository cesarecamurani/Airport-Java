package transports;

import org.junit.Test;
import java.util.ArrayList;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertEquals;
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

}

