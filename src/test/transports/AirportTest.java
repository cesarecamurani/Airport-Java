package transports;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.InjectMocks;

import static org.hamcrest.CoreMatchers.*;
import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

public class AirportTest {



    @Test
    public void clearForLandingUnderNormalConditions(){
        Airport gatwick = new Airport();
        Plane boeing = new Plane("Boeing");
        gatwick.ClearForLanding(boeing);
        assertThat(gatwick.hangar, hasItem(boeing));
    }
}

