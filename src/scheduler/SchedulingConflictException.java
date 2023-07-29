package scheduler;

import javax.swing.JOptionPane;

public class SchedulingConflictException extends Exception {
// TODO Auto-generated method stub
	 public void criticalError(){
			JOptionPane.showMessageDialog(null, "CRITICAL ERROR!!!");
		}
}
