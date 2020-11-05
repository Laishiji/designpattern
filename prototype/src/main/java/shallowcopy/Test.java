package shallowcopy;

public class Test {
    public static void main(String[] args){
        A aObj = new A(1, new C(2,3));
        A bObj = (A) aObj.clone();
        bObj.object.b = 100;//浅拷贝，拷贝对象修改引用类型的值

        System.out.println(aObj.object.b);//100,会影响到被拷贝对象中引用类型的值
    }
}
