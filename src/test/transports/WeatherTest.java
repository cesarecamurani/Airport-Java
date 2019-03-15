package transports;

import org.junit.Before;

import org.junit.Test;
import java.util.Random;

import static org.junit.Assert.*;

public class WeatherTest {

    private Weather today;
    private String currentWeather;
    private String[] conditions = { "Stormy", "Sunny", "Sunny" };
    private Random oneRand = new Random(1);
    private Random twoRand = new Random(2);
    private Random threeRand = new Random(3);

    @Before
    public void setUp(){
        today = new Weather(currentWeather);
    }

    @Test
    public void shouldReturnStormyCondition(){
        today.getWeatherConditions(oneRand);
        assertEquals(today.currentWeather, "Stormy");
    }

    @Test
    public void shouldReturnSunnyCondition1(){
        today.getWeatherConditions(twoRand);
        assertEquals(today.currentWeather, "Sunny");
    }

    @Test
    public void shouldReturnSunnyCondition2(){
        today.getWeatherConditions(threeRand);
        assertEquals(today.currentWeather, "Sunny");
    }

}






