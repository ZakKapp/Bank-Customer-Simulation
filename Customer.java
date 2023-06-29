/**
 * Project: Project 4
 * Completion time: 9 Hours
 * 
 * Honor Code: "I pledge that I have neither given nor received help from anyone
 * other than the instructor or the TAs for all program components included here."
 */

/**
 * @author Zak Kappenmen
 */
public class Customer {
    
    private int arrival = 0;
    private int priority = 0;
    
    // constructor
    public void Customer(int arrival, int priority){
        this.arrival = arrival;
        this.priority = priority;
    }
    
    public int getPriority(){
        return priority;
    }
    
    public void setPriority(int x){
        priority = x;
    }
    
    public void setArrival(int x){
        arrival = x;
    }
    
    public int getArrival(){
        return arrival;
    }
}
