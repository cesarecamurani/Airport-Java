package transports;

import org.junit.*;
import java.util.ArrayList;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class AirportTest {

    private ArrayList<Plane> hangar;
    private Airport gatwick;
    private String currentWeather;
    private Weather today;
    private Plane boeing;

    @Before
    public void setUp(){
        hangar = new ArrayList<>();
        gatwick = new Airport(hangar);
        currentWeather = "";
        today = new Weather(currentWeather);
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
    public void cannotClearForLandingWhenStormy(){
        today.currentWeather = "Stormy";
        gatwick.clearForLanding(boeing);
        assertThrows(Error.class, () -> gatwick.clearForLanding(boeing));
    }

    @Test(expected=Error.class)
    public void cannotClearForTakeOffWhenStormy() {
        today.currentWeather = "Stormy";
        gatwick.clearForTakeOff(boeing);
        assertThrows(Error.class, () -> gatwick.clearForTakeOff(boeing));
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



