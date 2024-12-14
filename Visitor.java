public class Visitor extends Person {  
    private String visitorId;  
    private String membershipType;  

    // 默认构造函数  
    public Visitor() {  
        super();  
        this.visitorId = "";  
        this.membershipType = "";  
    }  

    // 带参数的构造函数  
    public Visitor(String name, int age, String address, String visitorId, String membershipType) {  
        super(name, age, address);  
        this.visitorId = visitorId;  
        this.membershipType = membershipType;  
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
}