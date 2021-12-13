package edu.isu.assg4.observer;

import java.util.ArrayList;

public class IT326 extends Publisher {

	private String material = "";

	public IT326() {
		subscribers = new ArrayList<Subscriber>();
	}

	public void setMaterial(String material) {
		this.material = material;
		notifyAll();
	}

	public void register(Subscriber s) {
		subscribers.add(s);
	}

	public void unRegister(Subscriber s) {
		subscribers.remove(s);

	}

	public void updateAll() {
		for (Subscriber s : subscribers) {
			Preferences userPref = s.getPreferences();
			/**
			 * Check for userPref and then call Update
			 */
			s.update(material);
		}
	}

}