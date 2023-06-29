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
public class CustomerCompare implements Comparator<Customer>{
    @Override
    public int compare(Customer c1, Customer c2){
        if(c1.getPriority() > c2.getPriority())
            return 1;
        if(c1.getPriority() < c2.getPriority())
            return -1;
        return 0;
    }// end compare()
}// end class
