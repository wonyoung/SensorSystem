package com.wonyoung.sensorsystem;

import java.util.ArrayList;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends Activity {

	private ArrayList<String> sensors = new ArrayList<String>();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		ListView sensorListView = (ListView) findViewById(R.id.sensors_listview);
		final ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.sensors_item, sensors);
		sensorListView.setAdapter(arrayAdapter);
		
		Button addButton = (Button) findViewById(R.id.add_button);
		addButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				sensors.add("Sensor 1");
				arrayAdapter.notifyDataSetChanged();
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

}
