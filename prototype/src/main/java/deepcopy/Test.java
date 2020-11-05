package deepcopy;

public class Test {
    public static void main(String[] args){
        A aObj = new A(1, new C(2,3));
        A bObj = (A) aObj.clone();

        bObj.object.b = 100;

        System.out.println(aObj.object.b);//3, 深拷贝是完全拷贝

    }
}
