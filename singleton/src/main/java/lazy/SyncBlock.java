package lazy;//懒汉式

public class SyncBlock {
    //1.构造方法私有化，其他类不能new
    private SyncBlock(){}

    //2.私有静态变量
    private static SyncBlock instance;

    //3.公有静态方法，调用该方法时才创建实例
    public static SyncBlock getInstance(){
        //3.1.同步操作在条件判断之后, 不能保证线程安全
        if(instance == null){
            synchronized (SyncBlock.class){
                instance = new SyncBlock();
            }
        }
        return instance;
    }
}
