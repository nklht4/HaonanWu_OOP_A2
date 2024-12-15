// RideInterface.java  
public interface RideInterface {  
    void addVisitorToQueue(Visitor visitor); // 添加游客到队列  
    void removeVisitorFromQueue(Visitor visitor); // 从队列中移除特定游客  
    void printQueue(); // 打印当前队列  
    void runOneCycle(); // 运行一次骑乘  
    void addVisitorToHistory(Visitor visitor); // 添加游客到乘坐历史  
    boolean checkVisitorFromHistory(Visitor visitor); // 检查游客是否在乘坐历史中  
    int numberOfVisitors(); // 返回乘坐历史中的游客数量  
    void printRideHistory(); // 打印乘坐历史  
}