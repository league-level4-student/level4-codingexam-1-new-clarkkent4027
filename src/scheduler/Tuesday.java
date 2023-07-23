package scheduler;

import java.util.Scanner;

public class Tuesday extends Day {
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
	public void addEvent() throws SchedulingConflictException {
		// TODO Auto-generated method stub
		if (daily.size() < 1) {
			System.out.println("Please enter a time for your event.");
			Double time = scan.nextDouble();
			System.out.println("Please enter a description for your event.");
			scan.nextLine();
			String description = scan.nextLine();
			daily.add(new Event(time, description));
			System.out.println("Event added!");
		} else if (daily.size() >= 1) {
			System.out.println("Please enter a time for your event.");
			Double time = scan.nextDouble();
			System.out.println("Please enter a description for your event.");
			scan.nextLine();
			String description = scan.nextLine();
			daily.add(new Event(time, description));
			System.out.println("Event added!");
			Event Event1 = new Event(time, description);
			Node<Event> current = daily.getHead();
			while (current.getNext() != null) {
				if (current.getValue().getTime().equals(Event1.getTime())) {
					System.out.println(" ");
					System.out.println("CRITICAL ERROR");
					System.out.println("That time slot is already taken!!!");
					throw new SchedulingConflictException();
				}
				current = current.getNext();
			}
		}

	}

	@Override
	public void removeEvent() {
		// TODO Auto-generated method stub
		System.out.println("Please enter the number of the event you would like to delete.");
		int num = scan.nextInt();
		num = num - 1;
		daily.remove(num);
		System.out.println("Event removed!");
	}
}
