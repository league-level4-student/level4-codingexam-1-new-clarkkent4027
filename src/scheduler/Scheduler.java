package scheduler;

import java.util.Scanner;

/*
 * Objective: Create a weekly scheduling application.
 * 
 * You may create any additional enums, classes, methods or variables needed
 * to accomplish the requirements below:
 * 
 * - You should use an array filled with enums for the days of the week and each
 *   enum should contain a LinkedList of events that includes a time and what is 
 *   happening at the event.
 * 
 * - The user should be able to to interact with your application through the
 *   console and have the option to add events, view events or remove events by
 *   day.
 *   
 * - Each day's events should be sorted by chronological order.
 *  
 * - If the user tries to add an event on the same day and time as another event
 *   throw a SchedulingConflictException(created by you) that tells the user
 *   they tried to double book a time slot.
 *   
 * - Make sure any enums or classes you create have properly encapsulated member
 *   variables.
 */
public class Scheduler extends Day {

	public static void main(String[] args) {
		Scanner scam = new Scanner(System.in);
		boolean active = true;
		Sunday sun = new Sunday();
		Monday mon = new Monday();
		System.out.println(
				"Welcome to your Scheduler! Please type the day you would like to modify. On the next line, type 'add', 'remove', or 'view'!");
		do {
			String input = scam.next();

			if (input.equalsIgnoreCase("sunday")) {
				String modification = scam.next();
				if (modification.equals("add")) {
					sun.addEvent();
				} else if (modification.equals("remove")) {
					sun.removeEvent();
				} else if (modification.equals("view")) {
					sun.returnSchedule();

				}
			}

			if (input.equalsIgnoreCase("Monday")) {
				String modification = scam.next();
				if (modification.equals("add")) {
					mon.addEvent();
				} else if (modification.equals("remove")) {
					mon.removeEvent();
				} else if (modification.equals("view")) {
					mon.returnSchedule();

				}
			}

		} while (active == true);
	}

	@Override
	public void returnSchedule() {
		// TODO Auto-generated method stub

	}

	@Override
	public void addEvent() {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeEvent() {
		// TODO Auto-generated method stub

	}
}
