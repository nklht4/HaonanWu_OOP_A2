public class Visitor extends Person {  
    private String visitorId;  
    private String membershipType;  

    // 默认构造函数  
    public Visitor() {  
        super(); // 调用父类构造函数  
        this.visitorId = "";  
        this.membershipType = "";  
    }  

    // 带参数的构造函数（五个参数）  
    public Visitor(String name, int age, String address, String visitorId, String membershipType) {  
        super(name, age, address); // 调用父类构造函数  
        this.visitorId = visitorId;  
        this.membershipType = membershipType;  
    }  

    // 新增的构造函数（三个参数）  
    public Visitor(String name, int age, String address) {  
        super(name, age, address); // 调用父类构造函数  
        this.visitorId = ""; // 默认值  
        this.membershipType = ""; // 默认值  
    }  

    // Getter 和 Setter 方法  
    public String getVisitorId() {  
        return visitorId;  
    }  

    public void setVisitorId(String visitorId) {  
        this.visitorId = visitorId;  
    }  

    public String getMembershipType() {  
        return membershipType;  
    }  

    public void setMembershipType(String membershipType) {  
        this.membershipType = membershipType;  
    }  

    // 重写 toString 方法  
    @Override  
    public String toString() {  
        return "Visitor{" +  
                "name='" + getName() + '\'' +  
                ", age=" + getAge() +  
                ", address='" + getAddress() + '\'' +  
                ", visitorId='" + visitorId + '\'' +  
                ", membershipType='" + membershipType + '\'' +  
                '}';  
    }  
}