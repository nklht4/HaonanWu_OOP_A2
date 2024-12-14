public class Ride {  
    private String rideName;  
    private String rideType;  
    private boolean isOpen;  
    private Employee operator; // 主管理员  

    // 默认构造函数  
    public Ride() {  
        this.rideName = "";  
        this.rideType = "";  
        this.isOpen = false;  
        this.operator = null;  
    }  

    // 带参数的构造函数  
    public Ride(String rideName, String rideType, boolean isOpen, Employee operator) {  
        this.rideName = rideName;  
        this.rideType = rideType;  
        this.isOpen = isOpen;  
        this.operator = operator;  
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
}