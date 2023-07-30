package scheduler;

import java.util.Scanner;

public class Monday extends Day {
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
			current.getValue().returnEvent();

		}

	}

	@Override
	public void addEvent() throws SchedulingConflictException {
		// TODO Auto-generated method stub
		System.out.println("Please enter a time for your new event");
		Double time = scan.nextDouble();
		System.out.println("Wonderful! Next please enter a short description for your new event");
		scan.nextLine();
		String description = scan.nextLine();
		Event event = new Event(time, description);

		if (daily.size() == 0) {
			daily.add(new Event(time, description));
			System.out.println("Event added!");
		} else if (daily.size() == 1) {
			Node<Event> current = daily.getHead();
			if (current.getValue().getTime().equals(time)) {
				System.out.println("ERROR: Time slot is already taken!");
				throw new SchedulingConflictException();
			} else if (current.getValue().getTime() > time) {
				Node<Event> first = new Node<Event>(event);
				daily.getHead().setPrev(first);
				first.setNext(daily.getHead());
				daily.setHead(first);
			} else if (current.getValue().getTime() < time) {
				daily.add(event);
				System.out.println("Event added!");
			}
		} else if (daily.size() >= 1) {
			Node<Event> current = daily.getHead();
			Node<Event> next = current.getNext();
			while (current.getNext() != null) {
				if (current.getValue().getTime().equals(time)) {
					System.out.println("ERROR: Time slot is already taken!");
					throw new SchedulingConflictException();
				}
				current = current.getNext();
				next = current.getNext();
			}
			current = daily.getHead();
			next = current.getNext();
			if (daily.getHead().getValue().getTime() > time) {
				Node<Event> first = new Node<Event>(event);
				daily.getHead().setPrev(first);
				first.setNext(daily.getHead());
				daily.setHead(first);
			} else if (daily.size() == 1 && daily.getHead().getValue().getTime() < time) {
				daily.add(event);
				System.out.println("Event added!");
			} else {
				while (current.getNext() != null) {
					if (current.getValue().getTime() < time && next.getValue().getTime() > time) {
						Node<Event> pos = new Node<Event>(event);
						current.setNext(pos);
						pos.setNext(next);
						next.setPrev(pos);

					}
					current = current.getNext();
					next = current.getNext();
				}

				Node<Event> end = daily.getTail();
				if (daily.getTail() != null) {
					if (end.getValue().getTime() < time) {
						Node<Event> last = new Node<Event>(event);
						last.setPrev(daily.getTail());
						daily.getTail().setNext(last);
						daily.setTail(last);
					}

				}
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
