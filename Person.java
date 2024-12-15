public abstract class Person {  
    private String name;  
    private int age;  
    private String address;  

    // 默认构造函数  
    public Person() {  
        this.name = "";  
        this.age = 0;  
        this.address = "";  
    }  

    // 带参数的构造函数  
    public Person(String name, int age, String address) {  
        this.name = name;  
        this.age = age;  
        this.address = address;  
    }  

    // Getter 和 Setter 方法  
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