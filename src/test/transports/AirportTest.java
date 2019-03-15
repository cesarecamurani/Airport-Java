package transports;

import org.junit.*;
import java.util.ArrayList;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class AirportTest {

    private ArrayList<Plane> hangar = new ArrayList<>();
    private String currentWeather = new String();
    private Plane boeing;
    private Airport gatwick = new Airport(hangar);
    private Weather today = new Weather(currentWeather);

    @Before
    public void setUp(){
        boeing = new Plane("Boeing");
    }

    @Test
    public void changeCapacitySetAnotherCapacity(){
        gatwick.changeCapacity(15);
        assertEquals(gatwick.capacity, 15);
    }

    @Test
    public void clearForLandingUnderNormalConditions(){
        today.currentWeather = "Sunny";
        gatwick.clearForLanding(boeing);
        assertThat("Hangar contains boeing", gatwick.hangar, hasItem(boeing));
    }

    @Test
    public void clearForTakeOffUnderNormalConditions(){
        today.currentWeather = "Sunny";
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

    @Test(expected=Error.class)
    public void cannotTakeOffIfPlaneNotInHangar() {
        gatwick.clearForLanding(boeing);
        gatwick.clearForTakeOff(boeing);
        gatwick.clearForTakeOff(boeing);
        assertThrows(Error.class, () -> gatwick.clearForTakeOff(boeing));
    }

}



