package interfaceadapter;

public class Test {
    public static void main(String[] args) {

        DefaultAdapter defaultAdapter = new DefaultAdapter(){
            //该匿名内部类是抽象类DefaultAdapter的子类
            @Override
            public void m1(){
                System.out.println("只使用m1方法");
            }
        };
        defaultAdapter.m1();
    }
}
