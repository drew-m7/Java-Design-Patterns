package edu.isu.assg4.observer;

public abstract class Subscriber {
	/**
	 * Preference object. 
	 */
	protected Preferences userPref = null;
	public abstract void update(String c);
	public Preferences getPreferences(){
		return userPref;
	}
}
