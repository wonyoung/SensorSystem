package com.wonyoung.sensorsystem;

import java.util.ArrayList;

public class SensorSystem {

	ArrayList<Sensor> sensors = new ArrayList<Sensor>();
	
	public void register(Sensor sensor) {
		sensors.add(sensor);
	}

	public void warning() {
		for (Sensor s : sensors) {
			s.blink();
		}
	}

}
