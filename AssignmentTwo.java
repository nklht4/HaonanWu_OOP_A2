public class AssignmentTwo {  

    public static void main(String[] args) {  
        // 创建 AssignmentTwo 的实例以调用实例方法  
        AssignmentTwo assignment = new AssignmentTwo();  
        
        // 调用方法  
        assignment.partFourA();  
        assignment.partFourB();  
    }  

    public void partFourA() {  
        // 创建新的 Ride 对象  
        Employee operator = new Employee("John Doe", "Operator");  
        Ride ride = new Ride("过山车", "刺激", true, operator, 10);  
    
        // 添加游客到历史记录  
        Visitor visitor1 = new Visitor("Alice", 25, "123 Street", "T001", "普通");  
        Visitor visitor2 = new Visitor("Bob", 30, "456 Avenue", "T002", "会员");  
        Visitor visitor3 = new Visitor("Charlie", 22, "789 Boulevard", "T003", "普通");  
        Visitor visitor4 = new Visitor("David", 28, "321 Road", "T004", "会员");  
        Visitor visitor5 = new Visitor("Eva", 26, "654 Lane", "T005", "普通");  
    
        // 添加游客到队列  
        ride.addVisitorToQueue(visitor1);  
        ride.addVisitorToQueue(visitor2);  
        ride.addVisitorToQueue(visitor3);  
        ride.addVisitorToQueue(visitor4);  
        ride.addVisitorToQueue(visitor5);  
    
        // 运行一轮骑乘  
        ride.runOneCycle(); // Alice 乘坐  
        ride.runOneCycle(); // Bob 乘坐  
        ride.runOneCycle(); // Charlie 乘坐  
    
        // 打印乘坐历史  
        ride.printRideHistory();  
    
        // 检查游客是否在乘坐历史中  
        System.out.println("Is Alice in the ride history? " + ride.checkVisitorFromHistory(visitor1));  
        System.out.println("Is David in the ride history? " + ride.checkVisitorFromHistory(visitor4));  
    
        // 打印乘坐历史中的游客数量  
        System.out.println("Number of visitors in ride history: " + ride.numberOfVisitors());  
    }  
      

    public void partFourB() {  
        // 创建新的 Ride 对象  
        Employee operator = new Employee("John Doe", "Operator");  
        Ride ride = new Ride("摩天轮", "休闲", true, operator,30);  
    
        // 添加游客到该游乐设施  
        Visitor visitor1 = new Visitor("Ethan", 22, "1000 Main St", "T006", "普通");  
        Visitor visitor2 = new Visitor("Grace", 22, "2000 Main St", "T007", "会员");  
        Visitor visitor3 = new Visitor("Frank", 27, "3000 Main St", "T008", "普通");  
        Visitor visitor4 = new Visitor("Helen", 28, "4000 Main St", "T009", "会员");  
        Visitor visitor5 = new Visitor("Alice", 24, "5000 Main St", "T010", "普通");  
    
        // 添加游客到队列  
        ride.addVisitorToQueue(visitor1);  
        ride.addVisitorToQueue(visitor2);  
        ride.addVisitorToQueue(visitor3);  
        ride.addVisitorToQueue(visitor4);  
        ride.addVisitorToQueue(visitor5);  
    
        // 运行一轮骑乘  
        ride.runOneCycle(); // Ethan 乘坐  
        ride.runOneCycle(); // Grace 乘坐  
        ride.runOneCycle(); // Frank 乘坐  
        ride.runOneCycle(); // Helen 乘坐  
        ride.runOneCycle(); // Alice 乘坐  
    
        // 打印乘坐历史  
        System.out.println("Ride history before sorting:");  
        ride.printRideHistory();  
    
        // 使用 VisitorComparator 对乘坐历史进行排序  
        ride.sortRideHistory(new VisitorComparator());  
    
        // 打印排序后的乘坐历史  
        System.out.println("Ride history after sorting:");  
        ride.printRideHistory();  
    }

    public void partFive() {  
        // 创建新的 Ride 对象  
        Employee operator = new Employee("John Doe", "Operator");  
        Ride ride = new Ride("过山车", "刺激", true, operator,10); // 最大游客数为 5  

        // 添加游客到队列  
        for (int i = 1; i <= 10; i++) {  
            Visitor visitor = new Visitor("Visitor " + i, 20 + i, "地址 " + i, "T00" + i, "普通");  
            ride.addVisitorToQueue(visitor);  
        }  

        // 打印当前排队的游客  
        System.out.println("Visitors in the queue before running the ride:");  
        ride.printQueue();  

        // 运行一次骑乘  
        ride.runOneCycle();  

        // 打印当前排队的游客  
        System.out.println("Visitors in the queue after running the ride:");  
        ride.printQueue();  

        // 打印乘坐历史  
        System.out.println("Visitors who have taken the ride:");  
        ride.printRideHistory();  
    }
    public void partSix() {  
        // 创建新的 Ride 对象  
        Employee operator = new Employee("John Doe", "Operator");  
        Ride ride = new Ride("过山车", "刺激", true, operator, 10);
    
        // 添加游客到乘坐历史  
        for (int i = 1; i <= 5; i++) {  
            Visitor visitor = new Visitor("Visitor " + i, 20 + i, "地址 " + i, "T00" + i, "普通");  
            ride.runOneCycle(); // 假设每个游客都已经乘坐过  
            ride.rideHistory.add(visitor); // 将游客添加到乘坐历史  
        }  
    
        // 导出乘坐历史到文件  
        String filename = "ride_history.txt";  
        ride.exportRideHistory(filename);  
    }
    public void partSeven() {  
        Employee operator = new Employee("John Doe", "Operator");  
        Ride ride = new Ride("摩天轮", "观光", true, operator, 30);  
    
        // 导入乘坐历史  
        String filename = "ride_history.txt"; // 确保这个文件已经存在  
        ride.importRideHistory(filename);  
    
        // 打印乘坐的游客数量  
        System.out.println("Number of visitors in ride history: " + ride.rideHistory.size());  
    
        // 打印所有游客的信息  
        System.out.println("Visitors in ride history:");  
        for (Visitor visitor : ride.rideHistory) {  
            System.out.println(visitor);  
        }  
    }
}
