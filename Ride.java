import java.util.LinkedList;  
import java.util.Queue;  
import java.util.Iterator;  
import java.util.Collections;  
import java.util.Comparator;  

public class Ride implements RideInterface {  
    private String rideName;   
    private String rideType;   
    private boolean isOpen;   
    private Employee operator;   
    private Queue<Visitor> queue; // 用于存储等待的游客  
    private LinkedList<Visitor> rideHistory; // 用于存储乘坐历史  
    private int maxRider; // 每次骑行的最大游客数量  
    private int numOfCycles; // 骑行次数

    public Ride(String rideName, String rideType, boolean isOpen, Employee operator, int maxRider) {  
        this.rideName = rideName;   
        this.rideType = rideType;   
        this.isOpen = isOpen;   
        this.operator = operator;   
        this.queue = new LinkedList<>(); // 初始化队列  
        this.rideHistory = new LinkedList<>(); // 初始化乘坐历史  
        this.maxRider = maxRider; // 设置最大游客数量  
        this.numOfCycles = 0; // 初始化骑行次数
    }  
    

    
    // 添加游客到队列  
    @Override  
    public void addVisitorToQueue(Visitor visitor) {  
        queue.offer(visitor);  
        System.out.println(visitor.getName() + " has been added to the queue.");  
    }  

    // 从队列中移除特定游客  
    @Override  
    public void removeVisitorFromQueue(Visitor visitor) {  
        if (queue.remove(visitor)) {  
            System.out.println(visitor.getName() + " has been removed from the queue.");  
        } else {  
            System.out.println(visitor.getName() + " is not in the queue.");  
        }  
    }  

    // 打印当前排队的游客  
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

    // 运行一次骑乘  
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

        // 计算此次骑行的游客数量  
        int ridersThisCycle = Math.min(maxRider, queue.size());  
        System.out.println("Running the ride for " + ridersThisCycle + " visitors.");  

        for (int i = 0; i < ridersThisCycle; i++) {  
            Visitor visitor = queue.poll(); // 从队列中移除游客  
            rideHistory.add(visitor); // 将游客添加到乘坐历史  
            System.out.println(visitor.getName() + " has taken the ride.");  
        }  

        numOfCycles++; // 增加骑行次数  
        System.out.println("The ride has been run " + numOfCycles + " times.");  
    }  

    // 将游客添加到乘坐历史  
    @Override  
    public void addVisitorToHistory(Visitor visitor) {  
        rideHistory.add(visitor);  
        System.out.println(visitor.getName() + " has been added to the ride history.");  
    }  

    // 检查游客是否在乘坐历史中  
    @Override  
    public boolean checkVisitorFromHistory(Visitor visitor) {  
        return rideHistory.contains(visitor);  
    }  

    // 返回乘坐历史中的游客数量  
    @Override  
    public int numberOfVisitors() {  
        return rideHistory.size();  
    }  

    // 打印乘坐历史  
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

    // 按照指定比较器对乘坐历史进行排序  
    public void sortRideHistory(Comparator<Visitor> comparator) {  
        Collections.sort(rideHistory, comparator);  
        System.out.println("Ride history sorted.");  
    }  
}
