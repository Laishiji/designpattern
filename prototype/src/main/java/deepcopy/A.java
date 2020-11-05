package deepcopy;

class A implements Cloneable{
    int val;
    C object;
    A(int val, C obj){
        this.val = val;
        this.object = obj;
    }
    @Override
    public Object clone(){
        try{
            A a = (A) super.clone();
            a.object = (C) object.clone();
            return a;
        }catch(CloneNotSupportedException e){
            e.printStackTrace();
            return null;
        }
    }
}
