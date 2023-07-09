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
public class Scheduler {

	public enum DaysOfWeek {
		SUN, MON, TUES, WED, THUR, FRI, SAT;
		
	}
	

	public static void main(String[] args) {
		DaysOfWeek[] enums = new DaysOfWeek[DaysOfWeek.values().length];
		for (int i = 0; i < enums.length; i++) {
			LinkedList <String> events = new LinkedList <String>();
		
			
			
		}
			Scanner scan = new Scanner(System.in);
			
			
			
			
			
			System.out.println("Please type a day you would like to modify");
			String day = scan.nextLine();
		
		
	}
public void add () {
	Scanner scan = new Scanner(System.in);
	System.out.println("What is the event you would like to add?");
	String event = scan.nextLine();
	
}
public void remove () {
	Scanner scan = new Scanner(System.in);
	System.out.println("What is the event you would like to remove?");
	String event = scan.nextLine();
	
}
public void view () {
	
}
}
