package edu.isu.it326.designpatterns.observer;

import edu.isu.assg4.observer.Preferences.Duration;

public class TestObserver {

	public static void main(String args[]) {

		Preferences userPref = new Preferences(Duration.DAY, null);
		Subscriber rishi = new Rishi(userPref);
		IT326 it326 = new IT326();
		it326.register(rishi);

		it326.setMaterial("Please make sure to submit Sprint 1");
	}
}