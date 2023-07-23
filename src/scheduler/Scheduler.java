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

	public static void main(String[] args) throws Exception {
		Scanner scam = new Scanner(System.in);
		boolean active = true;
		Sunday sun = new Sunday();
		Monday mon = new Monday();
		Tuesday tues = new Tuesday();
		Wednesday wed = new Wednesday();
		Thursday thur = new Thursday();
		Friday fri = new Friday();
		Saturday sat = new Saturday();
		System.out.println("Welcome to your Scheduler! Please type out the day you would like to modify. Press 'ENTER.' Then, type 'add', 'remove', or 'view' to modify that day");

		do {
			String input = scam.next();

			if (input.equalsIgnoreCase("Sunday")) {
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

			if (input.equalsIgnoreCase("Tuesday")) {
				String modification = scam.next();
				if (modification.equals("add")) {
					tues.addEvent();
				} else if (modification.equals("remove")) {
					tues.removeEvent();
				} else if (modification.equals("view")) {
					tues.returnSchedule();

				}
			}
			
			if (input.equalsIgnoreCase("Wednesday")) {
				String modification = scam.next();
				if (modification.equals("add")) {
					wed.addEvent();
				} else if (modification.equals("remove")) {
					wed.removeEvent();
				} else if (modification.equals("view")) {
					wed.returnSchedule();

				}
			}
			
			if (input.equalsIgnoreCase("Thursday")) {
				String modification = scam.next();
				if (modification.equals("add")) {
					thur.addEvent();
				} else if (modification.equals("remove")) {
					thur.removeEvent();
				} else if (modification.equals("view")) {
					thur.returnSchedule();

				}
			}
			
			if (input.equalsIgnoreCase("Friday")) {
				String modification = scam.next();
				if (modification.equals("add")) {
					fri.addEvent();
				} else if (modification.equals("remove")) {
					fri.removeEvent();
				} else if (modification.equals("view")) {
					fri.returnSchedule();

				}
			}
			
			if (input.equalsIgnoreCase("Saturday")) {
				String modification = scam.next();
				if (modification.equals("add")) {
					sat.addEvent();
				} else if (modification.equals("remove")) {
					sat.removeEvent();
				} else if (modification.equals("view")) {
					sat.returnSchedule();

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
