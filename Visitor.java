public class Visitor extends Person {  
    private String visitorId;  
    private String membershipType;  

    // Default constructor  
    public Visitor() {  
        super(); // Call the parent class constructor 
        this.visitorId = "";  
        this.membershipType = "";  
    }  

    // Constructor with arguments (five arguments)  
    public Visitor(String name, int age, String address, String visitorId, String membershipType) {  
        super(name, age, address); // Call the parent class constructor
        this.visitorId = visitorId;  
        this.membershipType = membershipType;  
    }  

    // New constructor (three arguments)  
    public Visitor(String name, int age, String address) {  
        super(name, age, address); // Call the parent class constructor
        this.visitorId = ""; 
        this.membershipType = ""; 
    }  

    // Getter and Setter methods
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

    // Override the toString method
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