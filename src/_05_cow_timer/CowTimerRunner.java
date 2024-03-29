package _05_cow_timer;

import java.io.IOException;

public class CowTimerRunner {
	public static void main(String[] args) throws IOException {
	
        /* Make a CowTimer, set its time and start it.
         * Use a short delay (seconds) when testing, then try with longer delays
         */
  CowTimer cTimer = new CowTimer();
  cTimer.setTime(14);
  try {
	cTimer.start();
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}


    		 }
}
	


    	
    

