public class AssignmentTwo {  

    public static void main(String[] args) {  
        // Create an instance of AssignmentTwo to invoke the instance method  
        AssignmentTwo assignment = new AssignmentTwo();  
        
        // Calling method  
        assignment.partFourA();  
        assignment.partFourB();  
    }  

    public void partFourA() {  
        // Create a new Ride object  
        Employee operator = new Employee("John Doe", "Operator");  
        Ride ride = new Ride("Roller coaster", "irritate", true, operator, 10);  
    
        // Add visitors to history 
        Visitor visitor1 = new Visitor("Alice", 25, "123 Street", "T001", "Normal");  
        Visitor visitor2 = new Visitor("Bob", 30, "456 Avenue", "T002", "member");  
        Visitor visitor3 = new Visitor("Charlie", 22, "789 Boulevard", "T003", "Normal");  
        Visitor visitor4 = new Visitor("David", 28, "321 Road", "T004", "member");  
        Visitor visitor5 = new Visitor("Eva", 26, "654 Lane", "T005", "Normal");  
    
        // Add visitors to queue 
        ride.addVisitorToQueue(visitor1);  
        ride.addVisitorToQueue(visitor2);  
        ride.addVisitorToQueue(visitor3);  
        ride.addVisitorToQueue(visitor4);  
        ride.addVisitorToQueue(visitor5);  
    
        // Run a ride
        ride.runOneCycle(); 
        ride.runOneCycle();
        ride.runOneCycle(); 
    
        // Print ride history 
        ride.printRideHistory();  
    
        // Check if the guest is in the ride history  
        System.out.println("Is Alice in the ride history? " + ride.checkVisitorFromHistory(visitor1));  
        System.out.println("Is David in the ride history? " + ride.checkVisitorFromHistory(visitor4));  
    
        // Print the number of visitors in the ride history 
        System.out.println("Number of visitors in ride history: " + ride.numberOfVisitors());  
    }  
      

    public void partFourB() {  
        // Create a new Ride object  
        Employee operator = new Employee("John Doe", "Operator");  
        Ride ride = new Ride("Ferris wheel", "fallow", true, operator,30);  
    
        // Add visitors to the ride
        Visitor visitor1 = new Visitor("Ethan", 22, "1000 Main St", "T006", "Normal");  
        Visitor visitor2 = new Visitor("Grace", 22, "2000 Main St", "T007", "member");  
        Visitor visitor3 = new Visitor("Frank", 27, "3000 Main St", "T008", "Normal");  
        Visitor visitor4 = new Visitor("Helen", 28, "4000 Main St", "T009", "member");  
        Visitor visitor5 = new Visitor("Alice", 24, "5000 Main St", "T010", "Normal");  
    
        // Add visitors to queue 
        ride.addVisitorToQueue(visitor1);  
        ride.addVisitorToQueue(visitor2);  
        ride.addVisitorToQueue(visitor3);  
        ride.addVisitorToQueue(visitor4);  
        ride.addVisitorToQueue(visitor5);  
    
        // Run a ride 
        ride.runOneCycle();
        ride.runOneCycle();  
        ride.runOneCycle(); 
        ride.runOneCycle();  
        ride.runOneCycle(); 
    
        // Print ride history  
        System.out.println("Ride history before sorting:");  
        ride.printRideHistory();  
    
        // Use the VisitorComparator to rank the ride history 
        ride.sortRideHistory(new VisitorComparator());  
    
        // Print sorted ride history  
        System.out.println("Ride history after sorting:");  
        ride.printRideHistory();  
    }

    public void partFive() {  
        // Create a new Ride object
        Employee operator = new Employee("John Doe", "Operator");  
        Ride ride = new Ride("Roller coaster", "irritate", true, operator,10); // Maximum number of visitors

        // Add visitors to queue
        for (int i = 1; i <= 10; i++) {  
            Visitor visitor = new Visitor("Visitor " + i, 20 + i, "address " + i, "T00" + i, "Normal");  
            ride.addVisitorToQueue(visitor);  
        }  

        // Print the current queue of visitors
        System.out.println("Visitors in the queue before running the ride:");  
        ride.printQueue();  

        // Run a ride  
        ride.runOneCycle();  

        // Print the current queue of visitors 
        System.out.println("Visitors in the queue after running the ride:");  
        ride.printQueue();  

        // Print ride history 
        System.out.println("Visitors who have taken the ride:");  
        ride.printRideHistory();  
    }
    public void partSix() {  
        // Create a new Ride object 
        Employee operator = new Employee("John Doe", "Operator");  
        Ride ride = new Ride("Roller coaster", "irritate", true, operator, 10);
    
        // Add guests to ride history  
        for (int i = 1; i <= 5; i++) {  
            Visitor visitor = new Visitor("Visitor " + i, 20 + i, "address " + i, "T00" + i, "Normal");  
            ride.runOneCycle(); // Assume that every visitor has already taken one
            ride.rideHistory.add(visitor); // Add guests to ride history
        }  
    
        // Export the ride history to a file 
        String filename = "ride_history.txt";  
        ride.exportRideHistory(filename);  
    }
    public void partSeven() {  
        Employee operator = new Employee("John Doe", "Operator");  
        Ride ride = new Ride("Ferris wheel", "Go sightseeing", true, operator, 30);  
    
        // Import ride history  
        String filename = "ride_history.txt"; // Make sure the file already exists
        ride.importRideHistory(filename);  
    
        // Print the number of passengers on board 
        System.out.println("Number of visitors in ride history: " + ride.rideHistory.size());  
    
        // Print all visitor information
        System.out.println("Visitors in ride history:");  
        for (Visitor visitor : ride.rideHistory) {  
            System.out.println(visitor);  
        }  
    }
}
