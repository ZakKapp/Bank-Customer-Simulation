/**
 * Project: Project 4
 * Completion time: 9 Hours
 * 
 * Honor Code: "I pledge that I have neither given nor received help from anyone
 * other than the instructor or the TAs for all program components included here."
 */

/**
 * @author Zak Kappenman
 */
import java.util.*;
public class Event {
    // initializing variables
    private Random r = new Random();
    private int upperBound = 2;
    
    // method creates a 50/50 decision by randomly generating 0 or 1
    public int getEvent(){
        int event = r.nextInt(upperBound);
        return event;
    }// end getEvent()
}// end class
