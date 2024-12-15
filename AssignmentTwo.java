public class AssignmentTwo {  
    public static void partThree() {  
        // 创建一个新的 Ride 对象  
        Ride ride = new Ride("Ferris Wheel", "Adventure", true, new Employee("John Doe", "Operator"));  

        // 创建 Visitor 对象（假设 Visitor 类的构造函数）  
        Visitor visitor1 = new Visitor("Alice", 25, "123 Street");  
        Visitor visitor2 = new Visitor("Bob", 30, "456 Avenue");  
        Visitor visitor3 = new Visitor("Charlie", 22, "789 Boulevard");  
        Visitor visitor4 = new Visitor("David", 28, "101 Drive");  
        Visitor visitor5 = new Visitor("Eva", 24, "102 Place");  

        // 向队列中添加至少 5 名 Visitor  
        ride.addVisitorToQueue(visitor1);  
        ride.addVisitorToQueue(visitor2);  
        ride.addVisitorToQueue(visitor3);  
        ride.addVisitorToQueue(visitor4);  
        ride.addVisitorToQueue(visitor5);  

        // 打印当前队列  
        ride.printQueue();  

        // 从队列中移除一名 Visitor  
        ride.removeVisitorFromQueue(null);  

        // 再次打印队列  
        ride.printQueue();  
    }  

    public static void main(String[] args) {  
        partThree(); // 调用 partThree 方法进行演示  
    }  
}
