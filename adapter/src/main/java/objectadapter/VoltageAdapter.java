package objectadapter;

/**
 * 适配器类持有被适配类对象，实现目标接口
 */
public class VoltageAdapter implements Voltage5V {

    Voltage220V voltage220V;

    public VoltageAdapter(Voltage220V voltage220V){
        this.voltage220V = voltage220V;
    }

    @Override
    public int output5V() {
        int src = voltage220V.output220V();
        int dst = src / 44;//模拟变压操作
        return dst;
    }
}
