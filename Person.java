public abstract class Person {  
    private String name;  
    private int age;  
    private String address;  

    // Default constructor
    public Person() {  
        this.name = "";  
        this.age = 0;  
        this.address = "";  
    }  

    // A constructor with arguments
    public Person(String name, int age, String address) {  
        this.name = name;  
        this.age = age;  
        this.address = address;  
    }  

    // Getter and Setter methods
    public String getName() {  
        return name;  
    }  

    public void setName(String name) {  
        this.name = name;  
    }  

    public int getAge() {  
        return age;  
    }  

    public void setAge(int age) {  
        this.age = age;  
    }  

    public String getAddress() {  
        return address;  
    }  

    public void setAddress(String address) {  
        this.address = address;  
    }  
}