package edu.isu.assg4.observer;

import java.util.List;

public abstract class Publisher {

	List<Subscriber> subscribers;

	public abstract void register(Subscriber s);

	public abstract void unRegister(Subscriber s);

	public abstract void updateAll();
}
