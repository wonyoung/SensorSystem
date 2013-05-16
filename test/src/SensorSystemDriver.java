import com.wonyoung.sensorsystem.R;

import android.app.Activity;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;


public class SensorSystemDriver {

	private Activity activity;
	private ListView sensorList;
	private Button addButton;

	public SensorSystemDriver(Activity activity) {
		this.activity = activity;
		this.sensorList = (ListView) activity.findViewById(R.id.sensors_listview);
		this.addButton = (Button) activity.findViewById(R.id.add_button);
	}

	public int sensors() {
		return sensorList.getCount();
	}

	public void addSensor() {
		addButton.performClick();
	}

	public void draw() {
		sensorList.layout(0, 0, 100, 1000);
	}

	public String getSensorName(int i) {
		TextView sensorRow = (TextView) sensorList.getChildAt(i);
		return sensorRow.getText().toString();
	}

}
