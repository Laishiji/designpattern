
public class DoubleCheck {
    //1.构造方法私有化，其他类不能new
    private DoubleCheck(){}

    //2.私有静态volatile变量
    private static volatile DoubleCheck instance;

    //3.公有静态方法，调用该方法时才创建实例
    public static DoubleCheck getInstance(){

        if(instance == null){
            synchronized (DoubleCheck.class){
                if(instance == null) instance = new DoubleCheck();
            }
        }
        return instance;
    }
}
