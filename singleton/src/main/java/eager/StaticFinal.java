package eager;//饿汉式

public class StaticFinal {

    //1.构造方法私有化，其他类不能new
    private StaticFinal(){}

    //2.私有静态常量，创建类实例，连接-准备阶段赋值
    private static final StaticFinal INSTANCE = new StaticFinal();

    //3.公有静态方法，获取实例
    public static StaticFinal getInstance(){
        return INSTANCE;
    }

    public static void main(String[] args) {
        StaticFinal staticFinal = StaticFinal.getInstance();
        StaticFinal staticFinal1 = StaticFinal.getInstance();
        System.out.println(staticFinal == staticFinal1); //true
    }
}
