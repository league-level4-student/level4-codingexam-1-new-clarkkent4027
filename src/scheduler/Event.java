package scheduler;

public class Event {
 private Double time;
 private String description;
 Event (Double time, String description){
	 this.time = time;
	 this.description = description;
 }
 
 public void returnEvent() {
	 System.out.println(" ");
	 System.out.println(time + " = " + description);
	 System.out.println(" ");

 }
}
