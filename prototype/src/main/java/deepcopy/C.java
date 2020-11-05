package deepcopy;

class C implements Cloneable{
    int a;
    int b;
    C(int a, int b){
        this.a = a;
        this.b = b;
    }
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}