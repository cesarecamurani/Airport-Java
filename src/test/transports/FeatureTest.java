package transports;

import org.junit.*;
import java.util.ArrayList;
import java.util.Random;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FeatureTest {

    private ArrayList<Plane> hangar;
    private Airport gatwick;
    private String currentWeather;
    private Weather today;
    private Plane boeing;
    private Random oneRand;
    private Random twoRand;
    private Random threeRand;

    @Before
    public void setUp() {
        hangar = new ArrayList<>();
        gatwick = new Airport(hangar);
        currentWeather = "";
        today = new Weather(currentWeather);
        boeing = new Plane("Boeing");
        oneRand = new Random(1);
        twoRand = new Random(2);
        threeRand = new Random(3);
    }

    @Test
    public void featureTestPlaneLandNormally() {
        today.getWeatherConditions(twoRand);
        gatwick.clearForLanding(boeing, today);
        assertThat("Hangar contains boeing", gatwick.hangar, hasItem(boeing));
    }

    @Test
    public void featureTestPlaneTakeOffNormally() {
        today.getWeatherConditions(twoRand);
        gatwick.clearForLanding(boeing, today);
        gatwick.clearForTakeOff(boeing, today);
        assertThat("Hangar doesn't contains boeing", gatwick.hangar, not(hasItem(boeing)));
    }
}