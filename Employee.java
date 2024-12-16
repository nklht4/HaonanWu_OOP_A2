public class Employee {  
    private String name;  
    private String role;  

    // Default constructor 
    public Employee() {  
        this.name = "";  
        this.role = "";  
    }  

    // A constructor with arguments  
    public Employee(String name, String role) {  
        this.name = name;  
        this.role = role;  
    }  

    // Getter and Setter methods 
    public String getName() {  
        return name;  
    }  

    public void setName(String name) {  
        this.name = name;  
    }  

    public String getRole() {  
        return role;  
    }  

    public void setRole(String role) {  
        this.role = role;  
    }  
}