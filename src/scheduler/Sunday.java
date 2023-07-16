package scheduler;

import java.util.Scanner;

public class Sunday extends Day {
	LinkedList<Event> daily = new LinkedList<Event>();
	Scanner scan = new Scanner(System.in);

	@Override
	public void returnSchedule() {
		// TODO Auto-generated method stub
		Node<Event> current = daily.getHead();
		while (current.getNext() != null) {
			current.getValue().returnEvent();
			current = current.getNext();
		}
	}

	@Override
	public void addEvent() {
		// TODO Auto-generated method stub
		System.out.println("Please enter a time for your event.");
		Double time = scan.nextDouble();
		System.out.println("Please enter a description for your event.");
		String description = scan.next();
		daily.add(new Event(time, description));

	}

	@Override
	public void removeEvent() {
		// TODO Auto-generated method stub
		Node<Event> current = daily.getHead();
		while (current.getNext() != null) {
			current.getValue().returnEvent();
			current = current.getNext();
		}
		daily.getTail().getValue().returnEvent();
		System.out.println("Please enter the number of the event you would like to delete.");
		Integer num = scan.nextInt();
		num = num - 1;
		daily.remove(num);
}
}
