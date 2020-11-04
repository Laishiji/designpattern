package lazy;//懒汉式

public class SyncMethod {
    //1.构造方法私有化，其他类不能new
    private SyncMethod(){}

    //2.私有静态变量
    private static SyncMethod instance;

    //3.公有静态同步方法，调用该方法时才创建实例
    public static synchronized SyncMethod getInstance(){
        if(instance == null)
            instance = new SyncMethod();
        return instance;
    }
}
