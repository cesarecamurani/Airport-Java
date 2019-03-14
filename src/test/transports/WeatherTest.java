package transports;

import org.junit.Before;

import org.junit.Test;
import java.util.Random;

import static org.mockito.Mockito.*;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

public class WeatherTest {

    private Weather today;
    private String[] conditions = { "Stormy", "Sunny", "Sunny" };

    @Before
    public void setUp(){
        today = new Weather();
    }

    @Test
    public void shouldReturnStormyCondition(){
        today.getWeatherConditions();
        assertEquals(today.currentWeather, "Stormy");
    }

    @Test
    public void shouldReturnSunnyCondition(){
        today.getWeatherConditions();
        assertEquals(today.currentWeather, "Sunny");
    }

}




