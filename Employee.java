public class Employee {  
    private String name;  
    private String role;  

    // 默认构造函数  
    public Employee() {  
        this.name = "";  
        this.role = "";  
    }  

    // 带参数的构造函数  
    public Employee(String name, String role) {  
        this.name = name;  
        this.role = role;  
    }  

    // Getter 和 Setter 方法  
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