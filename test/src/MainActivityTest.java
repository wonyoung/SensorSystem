import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;

import android.app.Activity;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import com.wonyoung.sensorsystem.MainActivity;
import com.wonyoung.sensorsystem.R;


@RunWith(RobolectricTestRunner.class)
public class MainActivityTest {

	@Test
	public void showsSensorNameWhenSensorAdded() throws Exception {
		Activity activity = Robolectric.buildActivity(MainActivity.class)
				.create()
				.get();
		
		ListView sensorList = (ListView) activity.findViewById(R.id.sensors_listview);
		Button addButton = (Button) activity.findViewById(R.id.add_button);
		
		assertEquals(0, sensorList.getCount());
		addButton.performClick();
		assertEquals(1, sensorList.getCount());
		
		sensorList.layout(0, 0, 100, 1000);
		
		assertEquals(1, sensorList.getChildCount());
		TextView sensorRow = (TextView) sensorList.getChildAt(0);
		assertThat(sensorRow.getText().toString(), equalTo("Sensor 1"));
	}
}
