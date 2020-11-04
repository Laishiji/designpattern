package eager;//饿汉式

public class StaticBlock {
    //1.构造方法私有化，其他类不能new
    private StaticBlock(){}

    //2.私有静态常量
    private static final StaticBlock INSTANCE;

    //3.静态代码块中，初始化阶段赋值
    static {
        INSTANCE = new StaticBlock();
    }

    //4.公有静态方法，获取实例
    public static StaticBlock getInstance(){
        return INSTANCE;
    }

    public static void main(String[] args) {
        StaticBlock staticBlock = StaticBlock.getInstance();//调用类的静态方法->类初始化->静态代码块中创建实例
        StaticBlock staticBlock1 = StaticBlock.getInstance();
        System.out.println(staticBlock == staticBlock1); //true
    }
}
