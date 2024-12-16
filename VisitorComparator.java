import java.util.Comparator;  

public class VisitorComparator implements Comparator<Visitor> {  
    @Override  
    public int compare(Visitor v1, Visitor v2) {  
        // Sort by name, or by age if the name is the same
        int nameComparison = v1.getName().compareTo(v2.getName());  
        if (nameComparison != 0) {  
            return nameComparison;  
        }  
        return Integer.compare(v1.getAge(), v2.getAge());  
    }  
}