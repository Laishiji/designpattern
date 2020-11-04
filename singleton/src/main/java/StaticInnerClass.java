public class StaticInnerClass {
    //1.构造方法私有化，其他类不能new
    private StaticInnerClass(){}

    //2.私有静态内部类
    private static class Instance{
        //2.1.私有静态常量，创建对象
        private static final StaticInnerClass INSTANCE = new StaticInnerClass();
    }

    // 3.公有静态方法，由于外部类加载时不会同时加载内部类，
    // 调用该方法时调用内部类的静态常量，此时才加载内部类，创建实例
    public static StaticInnerClass getInstance(){
        return Instance.INSTANCE;
    }
}
