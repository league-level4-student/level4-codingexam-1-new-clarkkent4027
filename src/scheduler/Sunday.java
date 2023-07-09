package scheduler;

import java.util.Scanner;

public class Sunday extends Scheduler {
	LinkedList <String> SunEvents = new LinkedList <String>();
	
	public void add () {
		Scanner scan = new Scanner(System.in);
		System.out.println("What is the event you would like to add?");
		String event = scan.nextLine();
		SunEvents.add(event);
		System.out.println(event);
	}
	public void remove () {
		Scanner scan = new Scanner(System.in);
		System.out.println("What is the event you would like to remove?");
		String event = scan.nextLine();
		
	}
	public void view () {
		
	}
	}

