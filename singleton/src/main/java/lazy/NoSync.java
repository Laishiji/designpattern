package lazy;//懒汉式

public class NoSync {
    //1.构造方法私有化，其他类不能new
    private NoSync(){}

    //2.私有静态变量
    private static NoSync instance;

    //3.公有静态方法，调用该方法时才创建实例
    public static NoSync getInstance(){
        if(instance == null)
            instance = new NoSync();
        return instance;
    }

    public static void main(String[] args) {
        NoSync noSync = NoSync.getInstance();
        NoSync noSync1 = NoSync.getInstance();
        System.out.println(noSync==noSync1);//true
    }
}
