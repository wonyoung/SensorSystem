import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;

import android.app.Activity;

import com.wonyoung.sensorsystem.MainActivity;


@RunWith(RobolectricTestRunner.class)
public class MainActivityTest {

	private SensorSystemDriver driver;

	@Before
	public void setUp() throws Exception {
		Activity activity = Robolectric.buildActivity(MainActivity.class)
				.create()
				.get();
		
		driver = new SensorSystemDriver(activity);
	}

	@Test
	public void showsSensorNameWhenSensorAdded() throws Exception {
		assertEquals(0, driver.sensors());
		driver.addSensor();
		assertEquals(1, driver.sensors());

		driver.draw();

		assertThat(driver.getSensorName(0), equalTo("Sensor 1"));
	}
	
}
