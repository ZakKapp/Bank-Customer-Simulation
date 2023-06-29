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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // initializing variables
        Event event = new Event();
        Random priority = new Random();
        int tickCounter = 0;
        int totalCustomers = 0;
        int waitSum = 0;
        int average;
        // creating an Arraylist to store wait times for calculations
        ArrayList<Integer> waitTimes = new ArrayList<Integer>();
        
        // creating the first customer
        // imagine there is one customer waiting when the bank opens
        Customer startingCustomer = new Customer();
        
        // creating the priority queue and adding the starting customer to the queue
        PriorityQueue<Customer> queue = new PriorityQueue<Customer>(50, new CustomerCompare());
        queue.add(startingCustomer);
        
        while(tickCounter != 50){
            tickCounter++;
            int x = event.getEvent();
            
            if(x != 1){
                // if the number is zero, add a new customer to the queue and store their information
                Customer customer = new Customer();
                customer.setPriority(priority.nextInt(99)+1);
                customer.setArrival(tickCounter);
                queue.add(customer);
            } else {
                if(queue.size() < 1){
                    System.out.println("There are no customers to be served.");
                    continue;
                }// if statement to make sure it doesn't try to remove a customer from an empty queue
                
                // if the number is 1, remove the customer with highest priority
                // calculate their wait time and the average wait time of customers served
                totalCustomers++;
                Customer review = queue.remove();
                int wait = tickCounter - review.getArrival();
                waitTimes.add(wait);
                waitSum = waitSum + waitTimes.get(waitTimes.size()-1);
                average = waitSum/totalCustomers;
                
                // prints the result
                System.out.println("The average wait time for " + totalCustomers +
                        " customer(s) was " + average + " tick(s).");
            }// end else
            
        }// end while
        
    }// end main
    
}// end class
