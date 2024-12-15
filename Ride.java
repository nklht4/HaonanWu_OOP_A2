import java.util.ArrayList;  
import java.util.List;  

public class Ride implements RideInterface {  
    private String rideName;  
    private String rideType;  
    private boolean isOpen;  
    private Employee operator; // 主管理员  

    private List<Visitor> queue; // 用于管理等待的游客  
    private List<Visitor> history; // 用于管理乘坐记录  

    // 默认构造函数  
    public Ride() {  
        this.rideName = "";  
        this.rideType = "";  
        this.isOpen = false;  
        this.operator = null;  
        this.queue = new ArrayList<>();  
        this.history = new ArrayList<>();  
    }  

    // 带参数的构造函数  
    public Ride(String rideName, String rideType, boolean isOpen, Employee operator) {  
        this.rideName = rideName;  
        this.rideType = rideType;  
        this.isOpen = isOpen;  
        this.operator = operator;  
        this.queue = new ArrayList<>();  
        this.history = new ArrayList<>();  
    }  

    // Getter 和 Setter 方法  
    public String getRideName() {  
        return rideName;  
    }  

    public void setRideName(String rideName) {  
        this.rideName = rideName;  
    }  

    public String getRideType() {  
        return rideType;  
    }  

    public void setRideType(String rideType) {  
        this.rideType = rideType;  
    }  
    
    public boolean isOpen() {  
        return isOpen;  
    }  

    public void setOpen(boolean open) {  
        isOpen = open;  
    }  

    public Employee getOperator() {  
        return operator;  
    }  

    public void setOperator(Employee operator) {  
        this.operator = operator;  
    }  

    // 实现接口方法  

    @Override  
    public void addVisitorToQueue(Visitor visitor) {  
        queue.add(visitor);  
    }  

    @Override  
    public void removeVisitorFromQueue(Visitor visitor) {  
        queue.remove(visitor);  
    }  

    @Override  
    public void printQueue() {  
        System.out.println("Waiting visitors:");  
        for (Visitor visitor : queue) {  
            System.out.println(visitor.getName());  
        }  
    }  

    @Override  
    public void runOneCycle() {  
        // 示例：运行一次循环，假设每次循环最多让一位游客乘坐  
        if (!queue.isEmpty()) {  
            Visitor visitor = queue.remove(0);  
            System.out.println(visitor.getName() + " is riding " + rideName);  
            addVisitorToHistory(visitor);  
        }  
    }  

    @Override  
    public void addVisitorToHistory(Visitor visitor) {  
        history.add(visitor);  
    }  

    @Override  
    public boolean checkVisitorFromHistory(Visitor visitor) {  
        return history.contains(visitor);  
    }  

    @Override  
    public int numberOfVisitors() {  
        return history.size();  
    }  

    @Override  
    public void printRideHistory() {  
        System.out.println("Ride history:");  
        for (Visitor visitor : history) {  
            System.out.println(visitor.getName());  
        }  
    }  
}