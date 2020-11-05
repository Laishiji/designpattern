package shallowcopy;

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
            return super.clone();
        }catch(CloneNotSupportedException e){
            e.printStackTrace();
            return null;
        }
    }
}
