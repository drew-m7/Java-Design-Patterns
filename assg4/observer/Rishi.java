package edu.isu.assg4.observer;

public class Rishi extends Subscriber {

	/**
	 * This is a composition relationship as Subscribe creates the object and controls the lifecycle of it.
	 * @param pref
	 */
	Rishi(Preferences pref){
		this.userPref = new Preferences(pref.getDuration(), pref.getLastUpdate());
	}
	@Override
	public void update(String c) {
	}
}