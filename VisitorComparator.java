import java.util.Comparator;  

public class VisitorComparator implements Comparator<Visitor> {  
    @Override  
    public int compare(Visitor v1, Visitor v2) {  
        // 按照名字排序，如果名字相同则按照年龄排序  
        int nameComparison = v1.getName().compareTo(v2.getName());  
        if (nameComparison != 0) {  
            return nameComparison;  
        }  
        return Integer.compare(v1.getAge(), v2.getAge());  
    }  
}