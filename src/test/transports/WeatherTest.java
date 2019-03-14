package transports;

import org.junit.Before;
import org.junit.Test;
import java.util.Random;

import static org.mockito.Mockito.*;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;

public class WeatherTest {

    private Weather today;

    @Before
    public void setUp(){
        today = new Weather();
//        Random random = mock(Random.class);
    }

    @Test
    public void shouldReturnStormyCondition(){

    }

    @Test
    public void shouldReturnSunnyCondition(){

    }

}
