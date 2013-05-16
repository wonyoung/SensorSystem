import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import org.junit.Test;

import com.wonyoung.sensorsystem.Sensor;
import com.wonyoung.sensorsystem.SensorSystem;


public class SensorSystemTest {

	@Test
	public void allSensorsBlinksWhenSystemWarning() {
		SensorSystem system = new SensorSystem();
		
		Sensor sensor1 = mock(Sensor.class);
		Sensor sensor2 = mock(Sensor.class);
		
		system.register(sensor1);
		system.register(sensor2);
		
		system.warning();
		
		verify(sensor1).blink();
		verify(sensor2).blink();
	}

}
