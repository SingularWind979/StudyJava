package tools.smarthomesys.device;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * 智能设备类
 * 能够开关
 */

@Getter
@ToString
@NoArgsConstructor
public abstract class SmartDevice implements SmartDeviceSwitch {
    // 设备数量，属于SmartDevice类，所有设备共享
    public static int count = 0;
    // 设备名称，每个设备都有一个唯一的名称
    protected String name;
    // 设备类型，每个设备都有一个类型
    protected String type;
    // 设备ID，每个设备都有一个唯一的ID
    protected int id;
    // 设备开关状态，每个设备都有一个开关状态
    protected boolean isSwitchedOn;

    /**
     * 构造方法，用于创建一个新的智能设备
     * @param name 设备名称
     * @param type 设备类型
     */
    protected SmartDevice(String name, String type) {
        this.name = name;
        this.type = type;
        this.id = count++;
        this.isSwitchedOn = false;
    }

     /**
      * 开关设备
      */
    @Override
    public void switchDevice() {
        // 打印开关操作信息
        System.out.println("Switching " + id + ". " + name + " " + type + "......");
        // 打印当前开关状态
        System.out.println("Before:\t" + (isSwitchedOn?"On":"Off"));
        // 切换开关状态
        isSwitchedOn = !isSwitchedOn;
        // 打印切换后的开关状态
        System.out.println("After:\t" + (isSwitchedOn?"On":"Off"));
    }

    /**
     * 打印设备信息
     */
    public void printInfo() {
        System.out.println("|" + id + "\t|" + name + "\t|" + type + "\t|" + (isSwitchedOn?"On":"Off") + "|");
    }
}
