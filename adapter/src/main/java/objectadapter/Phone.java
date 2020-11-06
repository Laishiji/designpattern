package objectadapter;

/**
 * 模拟使用5V电压充电的手机
 */
public class Phone {

    public void charge(Voltage5V voltage5V){
        int voltage = voltage5V.output5V();
        if(voltage == 5)
            System.out.println("充电中...");
        else if(voltage > 5)
            throw new RuntimeException("电压过高，不能充电！");
    }

}
