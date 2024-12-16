// RideInterface.java
public interface RideInterface {
    void addVisitorToQueue(Visitor visitor);  // Add visitors to queue
    void removeVisitorFromQueue(Visitor visitor);  // Remove a specific visitor from the queue
    void printQueue();  // Print the current queue
    void runOneCycle();  // Run a ride
    void addVisitorToHistory(Visitor visitor);  // Add guests to ride history
    boolean checkVisitorFromHistory(Visitor visitor);  // Check if the passenger is in the ride history
    int numberOfVisitors();  // Return the number of tourists in the ride history
    void printRideHistory();  // Print the ride history
}