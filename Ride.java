import java.util.LinkedList;  
import java.util.Queue;  
import java.util.Iterator;  
import java.util.Collections;  
import java.util.Comparator;  
import java.io.BufferedWriter;  
import java.io.FileWriter;  
import java.io.BufferedReader;  
import java.io.FileReader; 
import java.io.IOException;  



public class Ride implements RideInterface {  
    private String rideName;   
    private String rideType;   
    private boolean isOpen;   
    private Employee operator;   
    private Queue<Visitor> queue; // Used to store waiting visitors  
    LinkedList<Visitor> rideHistory; // Used to store ride history
    private int maxRider; // Maximum number of visitors per ride  
    private int numOfCycles; // Number of rides

    public Ride(String rideName, String rideType, boolean isOpen, Employee operator, int maxRider) {  
        this.rideName = rideName;   
        this.rideType = rideType;   
        this.isOpen = isOpen;   
        this.operator = operator;   
        this.queue = new LinkedList<>(); // Initialize queue
        this.rideHistory = new LinkedList<>(); // Initializes the ride history 
        this.maxRider = maxRider; // Set a maximum number of visitors
        this.numOfCycles = 0; // Initialize the number of rides
    }  
    

    
    // Add visitors to queue
    @Override  
    public void addVisitorToQueue(Visitor visitor) {  
        queue.offer(visitor);  
        System.out.println(visitor.getName() + " has been added to the queue.");  
    }  

    // Remove a specific visitor from the queue
    @Override  
    public void removeVisitorFromQueue(Visitor visitor) {  
        if (queue.remove(visitor)) {  
            System.out.println(visitor.getName() + " has been removed from the queue.");  
        } else {  
            System.out.println(visitor.getName() + " is not in the queue.");  
        }  
    }  

    // Print the current queue of visitors
    @Override  
    public void printQueue() {  
        if (queue.isEmpty()) {  
            System.out.println("The queue is currently empty.");  
        } else {  
            System.out.println("Current Visitors in the queue:");  
            for (Visitor visitor : queue) {  
                System.out.println(visitor);   
            }  
        }  
    }  

    // Run a ride 
    @Override  
    public void runOneCycle() {  
        if (operator == null) {  
            System.out.println("The ride cannot be run because no operator is assigned.");  
            return;  
        }  

        if (queue.isEmpty()) {  
            System.out.println("The ride cannot be run because there are no visitors in the queue.");  
            return;  
        }  

        // Count the number of tourists on the ride  
        int ridersThisCycle = Math.min(maxRider, queue.size());  
        System.out.println("Running the ride for " + ridersThisCycle + " visitors.");  

        for (int i = 0; i < ridersThisCycle; i++) {  
            Visitor visitor = queue.poll(); // Remove visitors from the queue
            rideHistory.add(visitor); // Add guests to ride history
            System.out.println(visitor.getName() + " has taken the ride.");  
        }  

        numOfCycles++; // Increase cycling
        System.out.println("The ride has been run " + numOfCycles + " times.");  
    }  

    // Add guests to ride history
    @Override  
    public void addVisitorToHistory(Visitor visitor) {  
        rideHistory.add(visitor);  
        System.out.println(visitor.getName() + " has been added to the ride history.");  
    }  

    // Check if the guest is in the ride history 
    @Override  
    public boolean checkVisitorFromHistory(Visitor visitor) {  
        return rideHistory.contains(visitor);  
    }  

    // Return the number of visitors in the ride history 
    @Override  
    public int numberOfVisitors() {  
        return rideHistory.size();  
    }  

    // Print ride history
    @Override  
    public void printRideHistory() {  
        if (rideHistory.isEmpty()) {  
            System.out.println("No visitors have taken this ride.");  
        } else {  
            System.out.println("Visitors who have taken the ride:");  
            Iterator<Visitor> iterator = rideHistory.iterator();  
            while (iterator.hasNext()) {  
                System.out.println(iterator.next());   
            }  
        }  
    }  

    // Sort the ride history by the specified comparator  
    public void sortRideHistory(Comparator<Visitor> comparator) {  
        Collections.sort(rideHistory, comparator);  
        System.out.println("Ride history sorted.");  
    }  

    public void exportRideHistory(String filename) {  
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {  
            for (Visitor visitor : rideHistory) {  
                writer.write(visitor.toString());  
                writer.newLine();  
            }  
            System.out.println("Ride history exported successfully to " + filename);  
        } catch (IOException e) {  
            System.err.println("Error writing to file: " + e.getMessage());  
        }  
    }  
    
    public void importRideHistory(String filename) {  
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {  
            String line;  
            while ((line = reader.readLine()) != null) {  
                String[] details = line.split(","); // Suppose visitor information is separated by commas
                if (details.length == 5) {  
                    String name = details[0].split(": ")[1].trim();  
                    int age = Integer.parseInt(details[1].split(": ")[1].trim());  
                    String address = details[2].split(": ")[1].trim();  
                    String id = details[3].split(": ")[1].trim();  
                    String visitorType = details[4].split(": ")[1].trim();  
                    
                    Visitor visitor = new Visitor(name, age, address, id, visitorType);  
                    rideHistory.add(visitor); // Join the ride history
                    System.out.println(visitor.getName() + " has been imported from the file.");  
                } else {  
                    System.out.println("Invalid visitor details: " + line);  
                }  
            }  
        } catch (IOException e) {  
            System.err.println("Error reading the file: " + e.getMessage());  
        }  
    }  
}
