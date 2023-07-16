package scheduler;

public abstract class Day {
LinkedList<Event> daily;
public abstract void returnSchedule();
public abstract void addEvent();
public abstract void removeEvent();
}
