package classadapter;

/**
 * 适配器类继承自被适配类，实现目标接口
 */
public class VoltageAdapter extends Voltage220V implements Voltage5V {

    @Override
    public int output5V() {
        int src = super.output220V();
        int dst = src / 44;//模拟变压操作
        return dst;
    }
}
