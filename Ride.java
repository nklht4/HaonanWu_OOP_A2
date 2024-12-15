import java.util.LinkedList;  
import java.util.Queue;  
import java.util.Iterator;  

public class Ride implements RideInterface {  
    private String rideName;   
    private String rideType;   
    private boolean isOpen;   
    private Employee operator;   
    private Queue<Visitor> queue; // 用于存储等待的游客  
    private LinkedList<Visitor> rideHistory; // 用于存储乘坐历史  

    public Ride(String rideName, String rideType, boolean isOpen, Employee operator) {  
        this.rideName = rideName;   
        this.rideType = rideType;   
        this.isOpen = isOpen;   
        this.operator = operator;   
        this.queue = new LinkedList<>(); // 初始化队列  
        this.rideHistory = new LinkedList<>(); // 初始化乘坐历史  
    }  

    @Override  
    public void addVisitorToQueue(Visitor visitor) {  
        queue.offer(visitor);  
        System.out.println(visitor.getName() + " has been added to the queue.");  
    }  

    @Override  
    public void removeVisitorFromQueue(Visitor visitor) {  
        if (queue.remove(visitor)) { // 从队列中移除指定的游客  
            System.out.println(visitor.getName() + " has been removed from the queue.");  
        } else {  
            System.out.println(visitor.getName() + " is not in the queue.");  
        }  
    }  

    @Override  
    public void printQueue() {  
        if (queue.isEmpty()) {  
            System.out.println("The queue is currently empty.");  
        } else {  
            System.out.println("Current Visitors in the queue:");  
            for (Visitor visitor : queue) {  
                System.out.println(visitor); // 假设 Visitor 类实现了 toString() 方法  
            }  
        }  
    }  

    @Override  
    public void runOneCycle() {  
        if (!queue.isEmpty()) {  
            Visitor visitor = queue.poll(); // 从队列中获取并移除第一个游客  
            rideHistory.add(visitor); // 将游客添加到乘坐历史  
            System.out.println(visitor.getName() + " is riding the " + rideName + ".");  
        } else {  
            System.out.println("No visitors in the queue to ride.");  
        }  
    }  

    @Override  
    public void addVisitorToHistory(Visitor visitor) {  
        rideHistory.add(visitor);  
        System.out.println(visitor.getName() + " has been added to the ride history.");  
    }  

    @Override  
    public boolean checkVisitorFromHistory(Visitor visitor) {  
        return rideHistory.contains(visitor);  
    }  

    @Override  
    public int numberOfVisitors() {  
        return rideHistory.size();  
    }  

    @Override  
    public void printRideHistory() {  
        if (rideHistory.isEmpty()) {  
            System.out.println("No visitors have taken this ride.");  
        } else {  
            System.out.println("Visitors who have taken the ride:");  
            Iterator<Visitor> iterator = rideHistory.iterator();  
            while (iterator.hasNext()) {  
                System.out.println(iterator.next()); // 假设 Visitor 类实现了 toString() 方法  
            }  
        }  
    }  
}