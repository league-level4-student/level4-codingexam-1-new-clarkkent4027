package scheduler;

import java.util.Scanner;

public class Sunday extends Day {
	 LinkedList<Event> daily = new LinkedList<Event>();
	Scanner scan = new Scanner(System.in);

	@Override
	public void returnSchedule() {
		// TODO Auto-generated method stub
		if (daily.size() == 0) {
			System.out.println("Error: Schedule is empty");
		}
		if (daily.size() == 1) {
			Node<Event> current = daily.getHead();
			current.getValue().returnEvent();
		}
		if (daily.size() > 1) {
			Node<Event> current = daily.getHead();
			Node<Event> end = daily.getTail();

			while (current.getNext() != null) {
				current.getValue().returnEvent();
				current = current.getNext();
			}
			end.getValue().returnEvent();

		}

	}

	@Override
	public void addEvent() {
		// TODO Auto-generated method stub
		if (daily.size() == 0) {
			System.out.println("Please enter a time for your event.");
			Double time = scan.nextDouble();
			System.out.println("Please enter a description for your event.");
			String description = scan.next();
			daily.add(new Event(time, description));
			System.out.println("Event added!");
		}
		if (daily.size() > 0) {
			Node<Event> current = daily.getHead();
			while (current.getNext() != null) {
				current.getValue().returnEvent();
				current = current.getNext();
			}
		}

	}

	public static void SchedulingConflictException(Double time) throws Exception {
	 if (time < 0) {
	 throw new Exception();
	 }
	}

	@Override
	public void removeEvent() {
		// TODO Auto-generated method stub
		System.out.println("Please enter the number of the event you would like to delete.");
		int num = scan.nextInt();
		num = num - 1;
		daily.remove(num);
	}
}
